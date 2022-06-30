import java.lang.Character.UnicodeBlock;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }

      int countOfSpace = 0;
      {
        char[] charArray = input.toCharArray();
        for (char ch : charArray) {
          if (ch == ' ') {
            countOfSpace++;
          }
        }

        int spaceIndex = input.indexOf(' ');
        int spaceIndex1 = input.lastIndexOf(' ');
        boolean offIndex = spaceIndex == spaceIndex1;
        boolean cyrillic = input.chars()
            .mapToObj(UnicodeBlock::of)
            .anyMatch(b -> b.equals(UnicodeBlock.CYRILLIC));

        if (!offIndex && cyrillic && countOfSpace != 3) {
          System.out.println("Фамилия: " + input.substring(0, spaceIndex));
          System.out.println("Имя:" + input.substring(spaceIndex, spaceIndex1));
          System.out.println("Отчество: " + input.substring(spaceIndex1 + 1));
        } else {
          System.out.println("Введенная строка не является ФИО");
        }
      }
    }
  }
}

