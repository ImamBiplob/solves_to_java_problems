package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private int price;

    public String getTitle() {
        return title;
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public int compareTo(Book o) {
        return price - (o.price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java", "a", 200);
        Book b2 = new Book("Python", "b", 150);
        List<Book> booklist = new ArrayList<>();
        booklist.add(b1);
        booklist.add(b2);
        //Collections.sort(booklist);
        Collections.sort(booklist, new TitleComparator());
        System.out.println(Collections.binarySearch(booklist, b1));

        System.out.println(booklist);
    }
}
