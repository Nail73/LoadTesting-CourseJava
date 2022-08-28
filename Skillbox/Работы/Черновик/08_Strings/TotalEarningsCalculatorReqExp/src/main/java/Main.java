import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    calculateSalarySum(text);
  }

  public static int calculateSalarySum(String text) {

    int sum = 0;
    String regex = "\\d+";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
      int start = matcher.start();
      int end = matcher.end();
      int result = Integer.parseInt(text.substring(start, end));
      sum += result;
      System.out.println(sum);
    }
    return sum;
  }
}
