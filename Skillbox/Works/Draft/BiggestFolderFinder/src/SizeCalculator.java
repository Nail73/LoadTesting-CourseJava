import java.io.File;
import java.util.HashMap;

public class SizeCalculator {

  private static final char[] sizeMultiplier = {'B', 'K', 'M', 'G', 'T'};
  private static final HashMap<Character, Integer> char2multiplier = getMultipliers();

  private static long getFolderSize(File folder) {

    if (folder.isFile()) {
      return folder.length();
    }
    long sum = 0;
    File[] files = folder.listFiles();
    for (File file : files) {
      sum += getFolderSize(file);
    }
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

  public static long getSizeFromHumanReadable(String size) {

    char sizeFactor = size.replaceAll("[0-9\\s+]", "").charAt(0);
    int multiplier = char2multiplier.get(sizeFactor);
    long length = multiplier *  Long.parseLong(size.replaceAll("[^0-9]", ""));
    return length;
  }

  private static HashMap<Character, Integer> getMultipliers() {

    HashMap<Character, Integer> char2multiplier = new HashMap<>();
    for (int i = 0; i < sizeMultiplier.length; i++) {
      char2multiplier.put(sizeMultiplier[i], (int) Math.pow(1024, i));
    }
    return char2multiplier;
  }
}
