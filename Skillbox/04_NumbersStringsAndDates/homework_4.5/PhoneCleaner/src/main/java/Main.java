import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }

      String phone = input.replaceAll("[^0-9]", "");

      if (phone.length() < 11 && !(phone.length() < 10)) {
        System.out.println("7" + phone);
      }
      if (phone.length() == 11 && phone.charAt(0) != '9') {
        char[] c = phone.toCharArray();
        c[0] = '7';
        phone = new String(c);
        System.out.println(phone);
      }
      if (phone.length() > 11 || phone.length() < 10
          || phone.length() == 11 && phone.charAt(0) == '9') {
        System.out.println("Неверный формат номера");
      }
    }
  }
}

