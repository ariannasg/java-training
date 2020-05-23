package advanced;

// hash maps don't guarantee that the order is retained, but linked hash maps do.

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> phoneBook = new LinkedHashMap<>(
                4, // 4 as the initial map capacity
                0.75f, // when the map is 75% full, it will increase in size
                true // retrieve elements in the order they were accessed/modified, instead of in the order they were added
        );

        phoneBook.put("Kevin", 12345);
        phoneBook.put("Jill", 98765);
        phoneBook.put("Brenda", 123123);
        phoneBook.put("Gary", 22222);
        phoneBook.put("Joe", 1111);
        phoneBook.put("Carol", 33333);

        System.out.println("Kevin's number: " + phoneBook.get("Kevin"));
        phoneBook.put("Brenda", 55555);

        System.out.println("\nList of contacts in the phone book:");
        for (Map.Entry<String, Integer> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Brenda is printed last because he is the most recent modified element");
        System.out.println("Kevin is printed second to last because he is the second most recent accessed element");
    }
}

//CONSOLE OUTPUT:
//Kevin's number: 12345
//
//List of contacts in the phone book:
//Jill: 98765
//Gary: 22222
//Joe: 1111
//Carol: 33333
//Kevin: 12345
//Brenda: 55555
//Brenda is printed last because he is the most recent modified element
//Kevin is printed second to last because he is the second most recent accessed element
