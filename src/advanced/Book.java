package advanced;

public class Book {
    private String title;
    private String author;

    public Book(String title) {
        this.title = title;
    }

    public Book(String author,String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void pickUp() {
        System.out.println(title + " has been picked up from the pile of books");
    }

    @Override
    public String toString() {
        if (author != null) {
            return "Author: %s , title: %s".formatted(author, title);
        }

        return title;
    }
}
