import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    PhoneBook phoneBook = new PhoneBook();

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите номер, имя или команду:");
    while (true) {

      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
      if (input.equals("LIST")) {
        System.out.println(phoneBook.getAllContacts());
        continue;
      }
      if (phoneBook.checkingName(input) && phoneBook.getContactByName(input).isEmpty()) {

        System.out.println("Такого имени в телефонной книге нет.\n"
            + "\n"
            + "Введите номер телефона для абонента " + input);
        String inputNumber = scanner.nextLine();
        if (phoneBook.checkingPhone(inputNumber)) {
          phoneBook.addContact(inputNumber, input);
          System.out.println("Контакт сохранен.");
        } else {
          System.out.println("Не верный формат номера");
        }
        continue;
      }
      if (phoneBook.checkingName(input) && !phoneBook.getContactByName(input).isEmpty()) {
        System.out.println(
            "\nТакой контакт имеется, вот ваша телефонная книга:\n " + phoneBook.getAllContacts());
        continue;
      }
      if (phoneBook.checkingPhone(input) && phoneBook.getContactByPhone(input).isEmpty()) {

        System.out.println("Такого номера в телефонной книге нет.\n"
            + "\n"
            + "Введите имя абонента для телефона " + input);
        String inputName = scanner.nextLine();
        if (phoneBook.checkingName(inputName)) {
          phoneBook.addContact(input, inputName);
          System.out.println("Контакт сохранен.");
        } else {
          System.out.println("Не верный формат ввода");
        }
        continue;
      }
      if (phoneBook.checkingPhone(input) && !phoneBook.getContactByPhone(input).isEmpty()) {
        System.out.println(
            "\nТакой контакт имеется, вот ваша телефонная книга:\n " + phoneBook.getAllContacts());
      } else {
        System.out.println("Неверный формат ввода.");
      }
    }
  }
}

