package BookList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> myBooks = new ArrayList<>();
        myBooks.add(new Book("Book-0", 831, "author-0", "1998"));
        myBooks.add(new Book("Book-1", 1350, "author-1", "2007"));
        myBooks.add(new Book("Book-2", 906, "author-2", "1939"));
        myBooks.add(new Book("Book-3", 72, "author-3", "1823"));
        myBooks.add(new Book("Book-4", 34, "author-4", "2023"));
        myBooks.add(new Book("Book-5", 56, "author-5", "2001"));
        myBooks.add(new Book("Book-6", 100, "author-6", "1996"));
        myBooks.add(new Book("Book-7", 1080, "author-7", "1972"));
        myBooks.add(new Book("Book-8", 560, "author-8", "2003"));
        myBooks.add(new Book("Book-9", 280, "author-9", "2019"));

        Map<String, String> map = new TreeMap<>();
        myBooks.forEach(books -> map.put(books.getBookName(), books.getAuthor()));
        map.forEach((bookName, author) -> System.out.println("Book: " + bookName + "\tAuthor: " + author));

        List<Book> morethan100pages = myBooks.stream().filter(books -> books.getPages() > 100).toList();
        System.out.println("\nBooks with more than 100 pages: ");
        morethan100pages.stream()
                .forEach(book -> System.out.println("Book: " + book.getBookName() + "\tPages: " + book.getPages()
                        + "\tDate: " + book.getPublication()));

    }
}