package Printer;

public class Printer {

  String queue = "";
  int page = 0;

  public void add(String name, String text, int page) {
    queue = queue + "\n" + name + " - " +
        text + " - " + page;
  }

  public void clear() {
    queue = "";
  }

  public void print(String title) {
    System.out.println(title);
    if (queue.isEmpty()) {
      System.out.println("Очередь пуста");
    } else {
      System.out.println(queue);
    }
  }

  public int getPage() {
    return page;
  }
}
