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

      Matcher matcher = Pattern.compile("[а-яёА-яЁ\\-]").matcher(input);
      String[] FIO = input.split(" ");

      if (matcher.find() && input.split(" ").length == 3) {
        System.out.println("Фамилия: " + FIO[0]);
        System.out.println("Имя: " + FIO[1]);
        System.out.println("Отчество: " + FIO[2]);
      } else {
        System.out.println("Введенная строка не является ФИО");
        break;
      }
    }
  }
}
