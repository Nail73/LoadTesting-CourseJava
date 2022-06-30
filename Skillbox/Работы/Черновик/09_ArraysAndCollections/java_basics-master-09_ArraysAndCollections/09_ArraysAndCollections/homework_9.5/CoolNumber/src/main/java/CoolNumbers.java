import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class CoolNumbers {

  public static List<String> generateCoolNumbers() {

    String[] regexLetter = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
    String letter;
    String letter2;
    String letter3;
    int random;
    String number1;
    String number2;

    for (int carNumberIndex = 0; carNumberIndex <= 2_000_000; carNumberIndex++) {

      for (int letterIndex = 0; letterIndex < regexLetter.length; letterIndex++) {
        random = (int) (Math.round(Math.random() * 11));
        letter = regexLetter[random];
        for (int i = 1; i <= 999; i++) {
          for (int letterIndex2 = 0; letterIndex2 < regexLetter.length; letterIndex2++) {
            random = (int) (Math.round(Math.random() * 11));
            letter2 = regexLetter[random];
            for (int letterIndex3 = 0; letterIndex3 < regexLetter.length; letterIndex3++) {
              random = (int) (Math.round(Math.random() * 11));
              letter3 = regexLetter[random];
              for (int j = 1; j <= 199; j++) {
                number1 = String.format("%03d", i);
                number2 = String.format("%02d", j);
                return Collections.singletonList(letter + number1 + letter2 + letter3 + number2);
              }
            }
          }
        }
      }
    }
    return Collections.emptyList();
  }

  public static boolean bruteForceSearchInList(List<String> list, String number) {
    return list.contains(number);
  }

  public static boolean binarySearchInList(List<String> sortedList, String number) {
    Collections.sort(sortedList);
    return sortedList.contains(number);
  }

  public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
    return hashSet.contains(number);
  }

  public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
    return treeSet.contains(number);
  }
}
