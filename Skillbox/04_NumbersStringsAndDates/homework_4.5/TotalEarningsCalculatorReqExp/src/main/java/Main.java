import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
  }

  public static int calculateSalarySum(String text) {
    int result = 0;
    Matcher matcher = Pattern.compile("\\d+").matcher(text);
    while (matcher.find()) {
      int value = Integer.parseInt(matcher.group());
      System.out.print(value + " ");
      result += value;
    }
    System.out.println(result);
    return result;
  }
}
