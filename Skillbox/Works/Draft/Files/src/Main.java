import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.spi.AbstractResourceBundleProvider;

public class Main {

  public static void main(String[] args) {

//    File folder = new File("C:\\Users\\itmaster\\Desktop");
//    File [] files = folder.listFiles();
//    for(File file : files){
//      System.out.println(file.getAbsolutePath());
//    }

    StringBuilder builder = new StringBuilder();
//
////    try {
////      FileInputStream is = new FileInputStream("data/Paroli_2.txt");
////
////      for(;;){
////        int code = is.read();
////        if(code < 0){
////          break;
////        }
////        char ch = (char) code;
////        builder.append(ch);
////      }
////    } catch (Exception e) {
////      e.printStackTrace();
////    }
////    System.out.println(builder.toString());
//
//    try {
//      BufferedReader br = new BufferedReader(new FileReader("data/Paroli_2.txt"));
//
//      for(;;) {
//        String line = br.readLine();
//        if (line == null) {
//          break;
//        }
//        builder.append(line + "\n");
//      }
//    } catch (Exception e) {
//      e.printStackTrace();
//    }
//    System.out.println(builder.toString());

//    try {
//      List<String> lines = Files.readAllLines(Paths.get("data/Paroli_2.txt"));
//     lines.forEach(line -> builder.append(line).append("\n"));
//    } catch (Exception e) {
//      e.printStackTrace();
//    }
//    System.out.println(builder);

//    try {
//      PrintWriter writer = new PrintWriter("data/file.txt");
//      for(int i = 0; i < 1000; i++){
//        writer.write(i + "\n");
//             }
//      writer.flush();
//      writer.close();
//    } catch (FileNotFoundException e) {
//      e.printStackTrace();
//    }

    ArrayList <String> strings = new ArrayList<>();
    for(int i = 0; i < 1001; i++){
      strings.add(Integer.toString(i));
    }
    try {
      Files.write(Paths.get("data/file2"), strings);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
