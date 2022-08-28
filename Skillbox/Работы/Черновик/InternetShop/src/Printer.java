public class Printer {

  private String queue = ""; //список документов на печать

  private String textDocument = ""; //текст документа
  private String nameDocument = ""; //имя документа
  private int pendingPagesCount = 0; //количество страниц

  public Printer() {
    queue = "Очередь на печать: ";
  }

  public Printer(String queue, String textDocument, String nameDocument, int pendingPagesCount) {
    this();
    this.queue = this.queue + queue;
    this.textDocument = textDocument;
    this.nameDocument = nameDocument;
    this.pendingPagesCount = pendingPagesCount;
  }

  public void append(String textDocument) {
    append(textDocument, "", 1);
  }

  public void append(String textDocument, String nameDocument) {
    append(textDocument, nameDocument, 1);
  }

  public void append(String textDocument, String nameDocument, int pendingPagesCount) {
    queue += "Имя: " + nameDocument + "\nТекст: " + textDocument + "\nСтраниц: " + pendingPagesCount
        + "\n\n";
    this.pendingPagesCount += pendingPagesCount;
  }

  public void clear() {
    queue = "";
  }

  public int getPendingPagesCount() {
    return pendingPagesCount;
  }

  public String getTextDocument() {
    return textDocument;
  }

  public String getNameDocument() {
    return nameDocument;
  }

  public void print(String title) {
    System.out.println(title);
    if (queue.isEmpty()) {
      System.out.println("Очередь пуста");
    } else {
      System.out.println(queue);
    }
    clear();
  }
}
