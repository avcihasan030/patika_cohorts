package BookList;

import java.util.Date;

public class Book {
    private final String bookName;
    private final int pages;
    private final String author;
    private final String publication;

    public Book(String bookName, int pages, String author, String publication) {
        this.bookName = bookName;
        this.pages = pages;
        this.author = author;
        this.publication = publication;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublication() {
        return publication;
    }

}
