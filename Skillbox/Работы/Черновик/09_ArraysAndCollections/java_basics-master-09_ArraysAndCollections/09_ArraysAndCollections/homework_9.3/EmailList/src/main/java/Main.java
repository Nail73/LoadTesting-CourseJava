import java.util.Scanner;

public class Main {

  public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";

  public static void main(String[] args) {

    EmailList emailList = new EmailList();
    emailList.add("hello@yandex.ru");
    emailList.add("goodbuy@yandex.ru");

    Scanner scanner = new Scanner(System.in);
    System.out.println("Для добавления почты, введите ADD;\n"
        + "Для вывода списка почтовых адресов, введите LIST;\n"
        + "Для выхода, введите EXIT.\n");

    while (true) {
      String input = scanner.nextLine();
      if (input.equals("EXIT")) {
        break;
      }
      if (input.equals("ADD")) {
        emailList.add(input = scanner.nextLine());
      } else if (!input.equals("LIST")) {
        System.out.println(WRONG_EMAIL_ANSWER);
      }
      if (input.equals("LIST")) {
        System.out.println(emailList.getSortedEmails());
      }
    }
  }
}
