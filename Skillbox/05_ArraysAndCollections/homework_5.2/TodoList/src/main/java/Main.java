import java.util.Scanner;

public class Main {

  private static TodoList todoList = new TodoList() {{
    add("buy milk");
    add("learn java");
    add("create app");
    add("send email");
    add("write issue");
  }};

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String todoText = " ";

    while (!todoText.equals("EXIT")) {
      System.out.println("Введите команду или \"EXIT\" для завершения: ");
      todoText = scanner.nextLine();
      String[] commands = todoText.split("\\s+");

      String command = " ";
      String decision = null;
      int index = -1;

      if (todoText.matches("^[\\p{Upper}]+")) {
        command = todoText.trim();

      } else if (todoText.matches("^[\\p{Upper}]+\\s+\\d+")) {
        command = todoList.comm(commands);
        index = todoList.ind(commands);

      } else if (todoText.matches("^[\\p{Upper}]+\\s+\\d+.+")) {
        command = todoList.comm(commands);
        index = todoList.ind(commands);
        decision = todoList.scanDecision(commands, 2);

      } else if (todoText.matches("^[\\p{Upper}]+.+")) {
        command = todoList.comm(commands);
        decision = todoList.scanDecision(commands, 1);

      } else {
        System.out.println("Неверная команда.");
      }

      switch (command) {

        case ("LIST"):
          System.out.println("Список дел:");
          for (int i = 0; i < todoList.todo.size(); i++) {
            System.out.println("Дело номер: " + i + " " + todoList.todo.get(i));
          }
          break;

        case ("ADD"):
          if (index > -1 && index < todoList.todo.size()) {
            todoList.todo.add(index, decision);
            System.out.println("Добавлено дело \"" + decision + "\" с индексом " + index);
          } else if (index > todoList.todo.size()) {
            System.out.println("Укажите индекс не более " + (todoList.todo.size() - 1));
          } else {
            todoList.todo.add(decision);
          }
          break;

        case ("EDIT"):
          if (index > -1 && index < todoList.todo.size()) {
            todoList.todo.set(index, decision);
            System.out.println("Дело под индексом " + index + " изменена на \"" + decision + "\"");
          } else {
            System.out.println("Неверная команда. Укажите индекс редактируемого дела" +
                " значением не более " + (todoList.todo.size() - 1));
          }
          break;

        case ("DELETE"):

          if (index > -1 && index < todoList.todo.size()) {
            todoList.todo.remove(index);
            System.out.println("Дело с индексом " + index + " удалена");
          } else {
            System.out.println("Неверная команда. Укажите индекс удаляемого дела" +
                " значением не более " + (todoList.todo.size() - 1));
          }
          break;
        case ("EXIT"):
          System.out.println("Работа завершена.");
          break;

        default:
          System.out.println("Такой команды нет. \nДоступные команды: LIST, ADD, EDIT, DELETE.");
      }
    }
  }
}











