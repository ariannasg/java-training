package advanced;

import java.util.LinkedList;

// a linked list is a doubly linked collection of elements.
// each element in the list holds a reference to the previous and next items in the list.
// their main advantage is speed for addition and removal operations. they do take more memory than array lists.
// linked lists are very quick at adding and removing elements from the middle of the list.
// on the other hand, array lists are much faster when getting elements from the list.
public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();
        myList.add("A");
        myList.add("B");
        myList.add(1, "C"); // add C at index 1
        System.out.println(myList);
        myList.add(3, "D"); // add C at index 1
        System.out.println(myList);
        myList.remove("B");
        System.out.println(myList);

        System.out.println(myList.getFirst());
        System.out.println(myList.getLast());

        System.out.println("\nImplementing a queue with a linked list");
        LinkedList<Customer> queue = new LinkedList<>();
        // adds it to the end of the list (to the tail)
        queue.add(new Customer("Sally"));
        System.out.println("Sally arrived first to the bakery queue");
        queue.add(new Customer("Ben"));
        System.out.println("Ben arrived second to the bakery queue");
        queue.add(new Customer("Emma"));
        System.out.println("Emma arrived last to the bakery queue");

        System.out.println("Bakery queue: " + queue);
        System.out.println("We start serving people in the queue");

        do {
            serveCustomer(queue);
            System.out.println("People remaining in the queue: " + queue);
        } while (!queue.isEmpty());

        System.out.println("\nImplementing a stack with a linked list");
        LinkedList<Book> stack = new LinkedList<>();
        // adds it to the end of the list (to the tail)
        stack.push(new Book("I Robot"));
        System.out.println("\"I Robot\" was put first in the pile of books");
        stack.push(new Book("The Little Prince"));
        System.out.println("\"The Little Prince\" was put second in the pile of books");
        stack.push(new Book("The Picture of Dorian Gray"));
        System.out.println("\"The little Prince\" was put last in the pile of books");

        System.out.println("Pile of books: " + stack);
        System.out.println("Readers start picking books from the pile");

        do {
            pickUpBook(stack);
            System.out.println("Books remaining in the pile: " + stack);
        } while (!stack.isEmpty());

    }

    static void serveCustomer(LinkedList<Customer> queue) {
        Customer customer = queue.poll();

        if (customer != null) {
            customer.serve();
        }
    }

    static void pickUpBook(LinkedList<Book> stack) {
        Book book = stack.poll();

        if (book != null) {
            book.pickUp();
        }
    }
}

//CONSOLE OUTPUT:
//[A, C, B]
//[A, C, B, D]
//[A, C, D]
//A
//D
//
//Implementing a queue with a linked list
//Sally arrived first to the bakery queue
//Ben arrived second to the bakery queue
//Emma arrived last to the bakery queue
//Bakery queue: [Sally, Ben, Emma]
//We start serving people in the queue
//Sally has been served
//People remaining in the queue: [Ben, Emma]
//Ben has been served
//People remaining in the queue: [Emma]
//Emma has been served
//People remaining in the queue: []
//
//Implementing a stack with a linked list
//"I Robot" was put first in the pile of books
//"The Little Prince" was put second in the pile of books
//"The little Prince" was put last in the pile of books
//Pile of books: [The Picture of Dorian Gray, The Little Prince, I Robot]
//Readers start picking books from the pile
//The Picture of Dorian Gray has been picked up from the pile of books
//Books remaining in the pile: [The Little Prince, I Robot]
//The Little Prince has been picked up from the pile of books
//Books remaining in the pile: [I Robot]
//I Robot has been picked up from the pile of books
//Books remaining in the pile: []
