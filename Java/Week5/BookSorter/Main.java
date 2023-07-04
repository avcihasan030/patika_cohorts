package BookSorter;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> compareByName = new TreeSet<>();

        compareByName.add(new Book("C HOW TO PROGRAM", 945, "PAUL DEITEL & HARVEY DEITEL", 2012));
        compareByName.add(new Book("The art of computer programming", 3168, "Donald Knuth", 2011));
        compareByName.add(new Book("Concrete Mathematics", 672, "Ronald Graham", 1994));
        compareByName.add(new Book("Algorithms", 976, "Robert Sedgewick", 2011));
        compareByName.add(new Book("Operating System Concepts", 1040, "Abraham Silberschatz", 2011));

        System.out.println("Sort by name: ");
        for (Book book : compareByName) {
            System.out.println(book.getName());
        }

        System.out.println("\n##############################################\n");

        TreeSet<Book> sortByPages = new TreeSet<>(new Comparator<Book>() {

            @Override
            public int compare(Book o1, Book o2) {
                return Integer.compare(o1.getPages(), o2.getPages());
            }

        });

        sortByPages.addAll(compareByName);

        System.out.println("Sort by pages: ");
        for (Book book : sortByPages) {
            System.out.println(book.getName());
        }
    }
}
