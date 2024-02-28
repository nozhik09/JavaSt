package consult1.concult_11.entity;

public class Book {


    private Integer bookId;
    private String isbn;
    private String bookName;
    private Author author;


    public Book(Integer bookId, String isbn, String bookName, Author author) {
        this.bookId = bookId;
        this.isbn = isbn;
        this.bookName = bookName;
        this.author = author;

    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
