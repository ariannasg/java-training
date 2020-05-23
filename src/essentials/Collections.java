package essentials;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collections {
    public static void main(String[] args) {
        // arrays aren't resizable in java and are ordered.
        // list an ordered collection and is an interface.
        // array list is a concrete class that implements the list interface. should check also linked list and vector
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

        // map is an unordered collection and an interface. hashmap is a concrete impl of the map interface.
        Map<String, String> myMap = new HashMap<>();
        myMap.put("key1", "value1");
        myMap.put("key2", "value2");

        var keys = myMap.keySet(); // set is another kind of collection
        for (String key : keys) {
            System.out.println("key: %s, value: %s".formatted(key, myMap.get(key)));
        }
    }
}
