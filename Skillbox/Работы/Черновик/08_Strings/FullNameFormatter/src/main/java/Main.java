import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
      String surname = "";
      String name = "";
      String patronymic = "";

      int index1 = input.indexOf(' ', 0);
      int index2 = input.lastIndexOf(' ');

      boolean offIndex = index1 == index2;

      int countOfSpace = 0;
      {
        char[] charArray = input.toCharArray();
        for (char ch : charArray) {
          if (ch == ' ') {
            countOfSpace++;
          }
        }
        for (int i = 0; i < input.length(); i++) {
          if (Character.UnicodeBlock.of(input.charAt(i)).equals(Character.UnicodeBlock.CYRILLIC)
              && !offIndex && countOfSpace != 3) {
            surname = input.substring(0, index1).trim();
            name = input.substring(index1, index2).trim();
            patronymic = input.substring(index2).trim();
            String result = "Фамилия: " + surname + "\nИмя: " + name + "\nОтчество: " + patronymic;
            System.out.println(result);
            break;
          } else {
            System.out.println("Введенная строка не является ФИО");
            break;
          }
        }
      }
    }
  }
}