import java.util.Scanner;


public class Main {

  private static Scanner scanner = new Scanner(System.in);

  static PhoneBook phoneBook = new PhoneBook();

  public static void main(String[] args) {

    System.out.println("Введите номер, имя или команду: ");

    while (true) {

      String input = scanner.nextLine();

      if (input.equals("LIST")) {
        System.out.println(phoneBook.getAllContacts());
        break;
      }

      if (phoneBook.isPhone(input)) {
        if (phoneBook.isContainsPhone(input)) {
          System.out.println("Контакт c номером " + input + " " + phoneBook.getNameByPhone(input));
        } else {
          System.out.println("Такого номера нет! Введите имя для номера " + input + ":");
          String newName = scanner.nextLine();
          if (phoneBook.isName(newName)) {
            phoneBook.addContact(input, newName);
            System.out.println("Контакт сохранен");
          } else {
            System.out.println("Неверный формат имени, начните заново с ввода команды");
          }
        }
        continue;
      }

      if (phoneBook.isName(input)) {
        if (phoneBook.isContainsName(input)) {
          System.out.println("Контакт с именем " + input + " " + phoneBook.getPhonesByName(input));
        } else {
          System.out.println("Такого имени нет! Введите номер для контакта " + input + ":");
          String newPhone = scanner.nextLine();
          if (phoneBook.isPhone(newPhone)) {
            phoneBook.addContact(newPhone, input);
            System.out.println("Контакт сохранен");
          } else {
            System.out.println("Неверный формат номера, начните заново с ввода команды");
          }
        }
        continue;
      }
    }
  }
}






