package advanced;

import java.util.ArrayList;

// streams provide a clean and simple way to iterate over a variable using functional programming.
// do not confuse with input/output streams.
// foreach loops use external iteration -> this means that under the hood a new iterator object gets created,
// and it's used to check for a given condition. Problems that external iteration represents :
// - hard to write parallel iterations
// - requires boilerplate code
// - difficult to read
// - hard to abstract from behaviour
// Streams were introduced in java 8 as a solution to these problems; they use internal iteration.
// The stream() method returns a Stream object; which is an interface that contains a sequence of elements of
// the type of collection we called it on.
// streams have 2 types of methods: lazy (i.e: the filter method) and eager (i.e: foreach).
// using streams for chain filtered conditions is more readable and computationally efficient that nesting
// if statements inside a foreach loop
public class Streams {
    public static void main(String[] args) {
        ArrayList<Book> books = populateLibrary();

        books.stream().filter(book -> {
            return book.getAuthor().startsWith("J"); // this always need to be a boolean expression
        }).filter(book -> {
            return book.getTitle().startsWith("E");
        }).forEach(System.out::println);

        System.out.println();
        books.stream().filter(book -> book.getAuthor().startsWith("K")).forEach(System.out::println);
    }

    public static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Alice Walker", "The Color Purple"));
        books.add(new Book("Alice Walker", "Meridian"));
        books.add(new Book("Toni Morrison", "Beloved"));
        books.add(new Book("Toni Morrison", "Jazz"));
        books.add(new Book("Toni Morrison", "Paradise"));
        books.add(new Book("John Steinbeck", "The Grapes of Wrath"));
        books.add(new Book("John Steinbeck", "East of Eden"));
        books.add(new Book("Kazuo Ishiguro", "The Remains of the Day"));
        books.add(new Book("Kazuo Ishiguro", "Never Let Me Go"));
        books.add(new Book("Kazuo Ishiguro", "The Buried Giant"));
        books.add(new Book("Jane Austen", "Pride and Prejudice"));
        books.add(new Book("Jane Austen", "Emma"));
        books.add(new Book("Jane Austen", "Persuasion"));
        books.add(new Book("Jane Austen", "Mansfield Park"));
        books.add(new Book("Chinua Achebe", "Things Fall Apart"));
        books.add(new Book("Chinua Achebe", "No Longer at Ease"));
        books.add(new Book("Chinua Achebe", "Home and Exile"));

        return books;
    }
}

//CONSOLE OUTPUT:
//Author: John Steinbeck , title: East of Eden
//Author: Jane Austen , title: Emma
//
//Author: Kazuo Ishiguro , title: The Remains of the Day
//Author: Kazuo Ishiguro , title: Never Let Me Go
//Author: Kazuo Ishiguro , title: The Buried Giant
