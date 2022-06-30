import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }

      String regex = "7[0-9]{10}";
      String correctNumber = input.replaceAll("[^0-9]", "");

      if (correctNumber.length() == 10) {
        System.out.println(7 + correctNumber);
        break;
      } else if (correctNumber.matches(regex)) {
        System.out.println(correctNumber);
        break;
      } else if (correctNumber.length() == 11 && correctNumber.charAt(0) == '8') {
        String c = correctNumber.replaceAll("[8]", "7");
        System.out.println(c);
      } else {
        System.out.println("Неверный формат номера");
        break;
      }
    }
  }
}


