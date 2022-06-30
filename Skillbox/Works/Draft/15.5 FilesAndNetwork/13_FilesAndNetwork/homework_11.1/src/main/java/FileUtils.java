import java.io.File;

public class FileUtils {

  private static final char[] sizeMultiplier = {'B', 'K', 'M', 'G', 'T'};

  public static long calculateFolderSize(String path) {
    long sum = 0;
    File folder = new File(path);

    File[] files = folder.listFiles();
    for (File file : files != null ? files : new File[0]) {
      if (file.isFile()) {
        System.out.println(" ".repeat(2) + file.getAbsolutePath() + "\n" +
            "Размер файла: " + " ".repeat(1) + file.getName() + " - " +
            getHumanReadableSize(file.length())
        );
        sum += file.length();
      } else {
        sum += FileUtils.calculateFolderSize(file.getAbsolutePath());
      }
    }
    int index = path.lastIndexOf("\\");
    System.out.println(
        "Размер папки: " + path.substring(index + 1) + " - " + getHumanReadableSize(sum));
    return sum;
  }

  public static String getHumanReadableSize(long size) {

    for (int i = 0; i < sizeMultiplier.length; i++) {
      double value = ((double) size) / Math.pow(1024, i);
      if (value < 1024) {
        return Math.round(value) + " " + sizeMultiplier[i] + (i > 0 ? "b" : "");
      }
    }
    return "Very big!";
  }
}
