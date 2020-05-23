package advanced;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        // without generics
        List names = new ArrayList<>();
        names.add("Kelly");
        String firstItem = (String) names.get(0); // I need to covert the var to a string
        System.out.println("First item: " + firstItem);
        names.add(7); // I can add a different type to the list and the compiler won't complain

        // with Generics
        List<String> names2 = new ArrayList<>();
        names2.add("Kelly");
        String firstItem2 = names2.get(0); // I don't need to convert to string, it already knows
        System.out.println("First item: " + firstItem2);
        // names2.add(7); // I can't add a different type to the list, the compiler will throw an error
    }
}
