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
    }
}

//CONSOLE OUTPUT:
//[A, C, B]
//[A, C, B, D]
//[A, C, D]
//A
//D
