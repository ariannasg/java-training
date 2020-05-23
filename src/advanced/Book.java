package advanced;

public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void pickUp() {
        System.out.println(title + " has been picked up from the pile of books");
    }

    @Override
    public String toString() {
        return title;
    }
}
