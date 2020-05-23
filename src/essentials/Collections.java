package essentials;

import java.util.*;

// All collections extend the Iterable class which declares the foreach method.
// The Collection interface declares all methods collections must have such as add, remove, isEmpty, toArray, etc
// There's another layer of interfaces that extend the Collection interface, such as List, Set, Queue and others.
// Map is considered part of the Collections framework in Java, but it doesn't actually extend the Collection interface.
public class Collections {
    public static void main(String[] args) {
        // arrays  are ordered structures that aren't resizable.
        // list is an ordered collection that cat contain duplicated and. List is an interface.
        // ArrayList is a concrete class that implements the List interface. should check also linked list and vector
        List<String> myListOfStrings = new ArrayList<>();
        myListOfStrings.add("hello");
        myListOfStrings.add("world");

        // enhanced for loop
        for (String myString : myListOfStrings) {
            System.out.println(myString);
        }

        // traditional for loop
        for (int i = 0; i < myListOfStrings.size(); i++) {
            System.out.println(myListOfStrings.get(i));
        }

        // map is an unordered collection of key-value pair.
        // Map an interface. HashMap is a concrete implementation of the Map interface.
        Map<String, String> myMap = new HashMap<>();
        myMap.put("key1", "value1");
        myMap.put("key2", "value2");

        // sets are another kind of collection that contains no duplicates, unordered elements.
        // Set is an interface that extends the Collection interface§.
        Set<String> keys = myMap.keySet();
        for (String key : keys) {
            System.out.println("key: %s, value: %s".formatted(key, myMap.get(key)));
        }

        System.out.println("\nUsing the foreach method");
        myListOfStrings.forEach(System.out::println);
        myMap.forEach((key, value) -> System.out.println("key: %s, value: %s".formatted(key, value)));
    }
}

//CONSOLE OUTPUT:
//hello
//world
//hello
//world
//key: key1, value: value1
//key: key2, value: value2
//
//Using the foreach method
//hello
//world
//key: key1, value: value1
//key: key2, value: value2
