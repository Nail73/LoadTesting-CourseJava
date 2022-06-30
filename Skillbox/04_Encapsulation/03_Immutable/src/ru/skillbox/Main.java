package ru.skillbox;

public class Main {

  public static void main(String[] args) {
    Book book = new Book("Лед и пламя", "Дастан Клозе", 416, "978-5-906017-80-2");

    System.out.println(
        "Книга: " + book.getBookName() + "\n" + "Автор книги: " + book.getAuthorName() + "\n" +
            "Количество страниц: " + book.getNumberPages() + "\n" + "Номер ISBN: " + book
            .getIsbnNumber());
  }
}
