import com.dropbox.core.v2.DbxClientV2;

import javax.sound.sampled.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class JavaSoundRecorder {
    private DbxClientV2 client;
    private InputStream in;
    private String fileName;
    private AudioFileFormat.Type fileType = AudioFileFormat.Type.WAVE;
    private AudioFormat format;
    private TargetDataLine line;
    private DataLine.Info info;

    public JavaSoundRecorder(DbxClientV2 client)        
        {
        this.client = client;
        format = getAudioFormat();
        info = new DataLine.Info(TargetDataLine.class, format);
    }
   public void recordAudio (int milliseconds) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        Calendar calendar = new GregorianCalendar();
        fileName = dateFormat.format(calendar.getTime()) + " .wav";
        String filePath = "C:/Users/itmaster/IdeaProjects/record.wav" + fileName;
        File file = new File(filePath);
        start(file);
        stop (file, milliseconds);
   }
   private void start (File file) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    if (!AudioSystem.isLineSupported(info)) {
                        System.out.println("Line not supported");
                        System.exit(0);
                    }
                    line = (TargetDataLine) AudioSystem.getLine(info);
                    line.open(format);
                    line.start();
                    AudioInputStream ais = new AudioInputStream(line);
                    AudioSystem.write(ais, fileType, file);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        };
        thread.start();
   }
private void stop(File file, int milliseconds) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(milliseconds);
                    line.stop();
                    line.close();
                   } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                try {
                    in = new FileInputStream(file);
                    client.files().uploadBuilder ("/" + fileName).uploadAndFinish (in);
                    in.close();}
                catch (Exception e) {
                    e.printStackTrace();
                }
                file.delete();
                recordAudio(milliseconds);
            }
        };
thread.start();
    }
    private AudioFormat getAudioFormat() {
        float sampleRate = 16000;
        int sampleSizeInBits = 8;
        int channels = 2;
        boolean signed = true;
        boolean bigEndian = true;
        AudioFormat format = new AudioFormat(sampleRate, sampleSizeInBits,
                channels, signed, bigEndian);
        return format;
    }

}
