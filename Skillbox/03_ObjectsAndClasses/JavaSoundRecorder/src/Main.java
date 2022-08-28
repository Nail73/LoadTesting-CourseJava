import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main (String [] args) {
        String ACCESS_TOKEN = "sl.AkUTsl5NB_lpzBVcHzq5vNTqdV9Xyn_jMKY1WsonLDUyr5XMlKbLo7KWs5cPzgwGDgIOt1-GVaRS3qdDEarvuh3QW1Z2I3jMFzB108nz56nv4qjuRSTlQ4gSCyN6ZXlkkr3n1Og";

        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-tutorial").build();
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);

        JavaSoundRecorder recorder = new JavaSoundRecorder(client);
        recorder.recordAudio(10000);

        try {
            InputStream in = new FileInputStream("C:/Users/itmaster/IdeaProjects/file.wav");

            client.files().uploadBuilder("/record.wav");

        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }
}
