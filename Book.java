public class Book {
    private String title;
    private String year;
    private Author author;

    public Book(String title, String year, Author author) {
        setAuthor(author);
        setTitle(title);
        setYear(year);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
        System.out.println("Author: " + author.getName());
    }
}
