package ru.skillbox;

public class Book {

  private final String bookName;
  private final String authorName;
  private final int numberPages;
  private final String isbnNumber;

  public Book(String bookName, String authorName, int numberPages, String isbnNumber) {
    this.bookName = bookName;
    this.authorName = authorName;
    this.numberPages = numberPages;
    this.isbnNumber = isbnNumber;
  }

  public String getBookName() {
    return bookName;
  }

  public String getAuthorName() {
    return authorName;
  }

  public int getNumberPages() {
    return numberPages;
  }

  public String getIsbnNumber() {
    return isbnNumber;
  }
}
