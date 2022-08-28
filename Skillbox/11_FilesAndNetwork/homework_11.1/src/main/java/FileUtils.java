import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileUtils {

  public static String bytesIntoHumanReadable(long size) {

    long kilobyte = 1024;
    long megabyte = kilobyte * 1024;
    long gigabyte = megabyte * 1024;
    long terabyte = gigabyte * 1024;

    if ((size >= 0) && (size < kilobyte)) {
      return size + " B";

    } else if ((size >= kilobyte) && (size < megabyte)) {
      return (size / kilobyte) + " KB";

    } else if ((size >= megabyte) && (size < gigabyte)) {
      return (size / megabyte) + " MB";

    } else if ((size >= gigabyte) && (size < terabyte)) {
      return (size / gigabyte) + " GB";

    } else if (size >= terabyte) {
      return (size / terabyte) + " TB";

    } else {
      return size + " Bytes";
    }
  }

  public static long calculateFolderSize(String path) {

    Path files = Paths.get(path);
    long size = 0;
    try (Stream<Path> walk = Files.walk(files)) {
      size = walk
          .filter(Files::isRegularFile)
          .mapToLong(p -> {
            try {
              return Files.size(p);
            } catch (IOException e) {
              System.out.printf("Невозможно получить размер файла %s%n%s", p, e);
              return 0L;
            }
          }).sum();
    } catch (IOException e) {
      System.out.printf("Ошибка при подсчёте размера директории %s", e);
    }
    return size;
  }
}
