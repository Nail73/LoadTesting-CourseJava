import java.util.ArrayList;

public class TodoList {

  ArrayList<String> todoList = new ArrayList<>();

  public void add(String todo) {
    todoList.add(todo);
  }

  public void add(int index, String todo) {
    if (index > 0 && index < todoList.size()) {
      todoList.add(index, todo);
    }
    else todoList.add(todo);
  }

  public void edit(String todo, int index) {
    if (index > 0 && index < todoList.size()) {
      todoList.set(index, todo);
    }
  }

  public void delete(int index) {
    if (index > 0 && index < todoList.size()) {
      todoList.remove(index);
    }
  }

  public ArrayList<String> getTodos() {
    return todoList;
  }
}