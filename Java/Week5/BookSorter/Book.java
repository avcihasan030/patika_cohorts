package BookSorter;

public class Book implements Comparable<Book> {
    private String name;
    private int pages;
    private String authorName;
    private int publicationDate;

    public Book(String name, int pages, String authorName, int publicationDate) {
        this.name = name;
        this.pages = pages;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getPublish() {
        return publicationDate;
    }

    @Override
    public int compareTo(Book o) {

        return this.name.compareTo(o.name);
    }
}
