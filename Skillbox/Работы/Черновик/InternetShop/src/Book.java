public class Book {

  private final String nameBook;
  private final String author;
  private final int pageCount;
  private final int isbn;

  public Book(String NAME_BOOK, String AUTHOR, int PAGE_COUNT, int ISBN) {
    this.nameBook = NAME_BOOK;
    this.author = AUTHOR;
    this.pageCount = PAGE_COUNT;
    this.isbn = ISBN;
  }

  public String getNameBook() {
    return nameBook;
  }

  public String getAuthor() {
    return author;
  }

  public int getPageCount() {
    return pageCount;
  }

  public int getIsbn() {
    return isbn;
  }
}
