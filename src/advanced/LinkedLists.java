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
        queue.add(new Customer("Ben"));
        queue.add(new Customer("Emma"));
        queue.add(new Customer("Fred"));

        do {
            System.out.println(queue);
            serveCustomer(queue);
        } while (!queue.isEmpty());

    }

    static void serveCustomer(LinkedList<Customer> queue) {
        Customer customer = queue.poll();

        if (customer != null) {
            customer.serve();
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
//[Sally, Ben, Emma, Fred]
//Sally has been served
//[Ben, Emma, Fred]
//Ben has been served
//[Emma, Fred]
//Emma has been served
//[Fred]
//Fred has been served
