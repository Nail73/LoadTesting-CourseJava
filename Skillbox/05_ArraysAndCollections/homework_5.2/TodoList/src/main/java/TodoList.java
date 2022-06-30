import java.util.ArrayList;

public class TodoList {

  ArrayList<String> todo = new ArrayList<>();

  public static String comm(String[] string) {
    return string[0].trim();
  }

  public static int ind(String[] string) {
    return Integer.parseInt(string[1].trim());
  }

  public static String scanDecision(String[] string, int index) {
    StringBuilder sb = new StringBuilder();
    for (int i = index; i < string.length; i++) {
      sb.append(string[i]).append(" ");
    }
    return sb.toString().trim();
  }

  public void add(String todo) {

    getTodos().add(todo);

  }

  public void add(int index, String todo) {

    for (int i = 0; i < getTodos().size(); i++) {
      if (index > -1 && index < getTodos().size()) {
        getTodos().add(index, todo);
      }
      if (index > -1 && index > getTodos().size()) {
        getTodos().add(todo);
      }
    }
  }

  public void edit(String todo, int index) {
    for (int i = 0; i < getTodos().size(); i++) {
      if (index > -1 && index < getTodos().size()) {
        getTodos().set(index, todo);
      }
    }
  }

  public void delete(int index) {
    for (int i = 0; i < getTodos().size(); i++) {
      if (index > -1 && index < getTodos().size() - 1) {
        getTodos().remove(index);
      }
    }
  }

  public ArrayList<String> getTodos() {

    return todo;

  }
}