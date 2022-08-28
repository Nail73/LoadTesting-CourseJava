import java.util.Scanner;

public class Main {

  private static TodoList todoList = new TodoList();

  public static void main(String[] args) {

    todoList.add("Пить");
    todoList.add("Курить");
    todoList.add("Есть");
    todoList.add("Спать");
    todoList.add("Ходить");

    Scanner sc = new Scanner(System.in);
    while (true) {
      String str = "LIST";
      System.out.print("Чтобы посмотреть содержимое списка введите команду LIST : ");
      if (sc.hasNext()) {
        str = sc.next();
        System.out.println(str);
      } else {
        System.out.println("Вы ввели не правильную команду");
      }
      for (String item : todoList.getTodos()) {
        System.out.println(item);
      }
      String strAdd = "ADD";
      System.out.print("Чтобы добавить новое дело в список введите команду ADD : ");
      if (sc.hasNext()) {
        strAdd = sc.next();
        System.out.println(strAdd + '\n' + "Введите дело которое хотите добавить в список : ");
        todoList.add(sc.next());
        System.out.println("Новое дело добавленно в список! \n");
      } else {
        System.out.println("Вы ввели не правильную команду");
      }
      String strEdit = "EDIT";
      System.out.print("Чтобы отредактировать дело, введите команду EDIT: ");
      if (sc.hasNext()) {
        strEdit = sc.next();
        System.out.println(
            strEdit + '\n' + "Введите порядковый номер дела, которое вы хотите изменить");
        Scanner scanner2 = new Scanner(System.in);
        int dealNumber = scanner2.nextInt();
        System.out.println("Введите, новое задание вместо старого");
        Scanner scanner3 = new Scanner(System.in);
        String dealEdit = scanner3.nextLine();
        todoList.edit(dealEdit, dealNumber);
        todoList.todoList.set(dealNumber, dealEdit);
      }
      String strDelete = "DELETE";
      System.out.print("Чтобы удалить дело, введите команду DELETE: ");
      if (sc.hasNext()) {
        strDelete = sc.next();
        System.out.println(
            strDelete + '\n' + "Введите порядковый номер дела, которое вы хотите удалить");
        Scanner scanner4 = new Scanner(System.in);
        int dealNumber = scanner4.nextInt();
        todoList.delete(dealNumber);
        todoList.todoList.remove(dealNumber);
      }
    }
  }
}







