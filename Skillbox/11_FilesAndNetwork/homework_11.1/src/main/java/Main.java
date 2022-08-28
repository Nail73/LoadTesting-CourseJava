import com.google.common.io.Files;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String path = scanner.nextLine();

    System.out.println("Размер папки: " + Files.getNameWithoutExtension(path) + " - " +
        FileUtils.bytesIntoHumanReadable(FileUtils.calculateFolderSize(path)));
  }
}

