import java.util.Scanner;
import java.util.TreeSet;

public class Main {

  private static EmailList emailList = new EmailList();

  public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";

  public static void main(String[] args) {

    boolean program = false;

    String[] value = new String[3];
    value[0] = "LIST";
    value[1] = "ADD";
    value[2] = "EXIT";

    TreeSet<String> eMail = new TreeSet<>();

    while (program == false) {

      String scanner = new Scanner(System.in).nextLine().trim();

      String[] command = scanner.split("\\s+");
      String finishValue = scanner.replaceFirst("\\w\\s+", "");

      if (command[0].equals(value[0])) {
        for (String item : eMail) {
          System.out.println(item.replaceFirst("ad", ""));
        }
      } else if (command[0].equals(value[1]) && finishValue
          .matches("([A-Za-z0-9\\.]+\\@[A-Za-z0-9]+\\.[A-Za-z0-9]+)")) {
        eMail.add(finishValue.toLowerCase());
      } else if (command[0].equals(value[2])) {
        break;
      } else {
        System.out.println(WRONG_EMAIL_ANSWER);
      }
    }
  }
}



