import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

  public static void main(String[] args) {

    try {

      Document doc = Jsoup.connect("https://lenta.ru/").get();
      Elements img = doc.getElementsByTag("img");
      for (Element el : img) {
        String src = el.absUrl("src");
        System.out.println("Image Found!");
        System.out.println("src attribute is : " + src);
        getImages(src);
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  private static void getImages(String src) {

    try {

      int indexname = src.lastIndexOf("/");
      if (indexname == src.length()) {
        src = src.substring(1, indexname);
      }
      indexname = src.lastIndexOf("/");
      String name = src.substring(indexname);

      System.out.println(name);

      URL url = new URL(src);
      InputStream in = url.openStream();

      String folderPath = "C:\\Users\\itmaster\\IdeaProjects\\Skillbox\\java_basics\\11_FilesAndNetwork\\homework_11.4\\images";
      OutputStream out = new BufferedOutputStream(new FileOutputStream(folderPath + name));
      for (int b; (b = in.read()) != -1; ) {
        out.write(b);
      }
      out.close();
      in.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
