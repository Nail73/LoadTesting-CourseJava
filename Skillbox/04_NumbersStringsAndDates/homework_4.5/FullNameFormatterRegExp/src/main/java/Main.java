import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
      int spaceIndex = input.indexOf(' ');
      int spaceIndex1 = input.lastIndexOf(' ');
      boolean offIndex = spaceIndex == spaceIndex1;
      Matcher matcher = Pattern.compile("[а-яА-я]").matcher(input);

      if (!offIndex && matcher.find() && input.split(" ").length == 3) {
        System.out.println("Фамилия: " + input.substring(0, spaceIndex));
        System.out.println("Имя:" + input.substring(spaceIndex, spaceIndex1));
        System.out.println("Отчество: " + input.substring(spaceIndex1 + 1));
      } else {
        System.out.println("Введенная строка не является ФИО");
      }
    }
  }
}