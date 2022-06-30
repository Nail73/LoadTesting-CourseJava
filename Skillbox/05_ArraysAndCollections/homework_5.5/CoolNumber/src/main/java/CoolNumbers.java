import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class CoolNumbers {

  public static ArrayList<String> list = new ArrayList<>();

  public static List<String> generateCoolNumbers() {
    String[] letters = {"С", "М", "Т", "В", "А", "Р", "О", "Н", "Е", "У", "Х", "К"};
    Arrays.sort(letters);
    for (int x = 0; x < letters.length; x++) {
      for (int n = 1; n < 10; n++) {
        for (int y = 0; y < letters.length; y++) {
          for (int z = 0; z < letters.length; z++) {
            for (int r = 1; r <= 199; r++) {

              String region = String.valueOf(r);
              if (r < 10) {
                region = "0" + region;
              }
              String number = String
                  .format("%s%d%d%d%s%s%s", letters[x], n, n, n, letters[y], letters[z], region);
              list.add(number);
            }
          }
        }
      }
    }
    return list;
  }

  public static boolean bruteForceSearchInList(List<String> list, String number) {
    for (String string : list) {
      if (string.contains(number)) {
        return true;
      }
    }
    return false;
  }

  public static boolean binarySearchInList(List<String> sortedList, String number) {
    return Collections.binarySearch(sortedList, number) >= 0;
  }

  public static boolean bruteForceSearchInHashSet(HashSet<String> hashSet, String number) {
    return hashSet.contains(number);
  }

  public static boolean bruteForceSearchInTreeSet(TreeSet<String> treeSet, String number) {
    return treeSet.contains(number);
  }
}
