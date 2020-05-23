package advanced;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        System.out.println("Intro to generics");
        introToGenerics();

        System.out.println("\nGeneric methods");
        System.out.print("Can use the printAnyTypeAsAString method for chars: ");
        printAnyTypeAsAString('a');
        System.out.print("Can use the printAnyTypeAsAString method for integers: ");
        printAnyTypeAsAString(1);
        System.out.print("Can use the printAnyTypeAsAString method for doubles: ");
        printAnyTypeAsAString(3.5);
        System.out.print("Can use the printAnyTypeAsAString method for floats: ");
        printAnyTypeAsAString(30000000.5333);
        System.out.print("Can use the printAnyTypeAsAString method for booleans: ");
        printAnyTypeAsAString(true);

        System.out.println();
        Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
        Integer[] intArray = {1, 2, 3, 4, 5};
        Boolean[] boolArray = {true, false, true};

        System.out.println("Can use the convertArrayToList method for chars: first item is "
                + convertArrayToList(charArray).get(0));
        System.out.println("Can use the convertArrayToList method for booleans: first item is "
                + convertArrayToList(boolArray).get(0));
        System.out.println("Can use the convertArrayToList method for integers: first item is "
                + convertArrayToList(intArray).get(0));
    }

    public static void introToGenerics() {
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

    public static <T> void printAnyTypeAsAString(T x) {
        System.out.println(x.toString());
    }

    // this is a generic method
    public static <T> List<T> convertArrayToList(T[] array) {
        List<T> list = new ArrayList<>();

        for (T value : array) {
            list.add(value);
        }

        return list;
    }
}

//CONSOLE OUTPUT:
//Intro to generics
//First item: Kelly
//First item: Kelly
//
//Generic methods
//Can use the printAnyTypeAsAString method for chars: a
//Can use the printAnyTypeAsAString method for integers: 1
//Can use the printAnyTypeAsAString method for doubles: 3.5
//Can use the printAnyTypeAsAString method for floats: 3.00000005333E7
//Can use the printAnyTypeAsAString method for booleans: true
//
//Can use the convertArrayToList method for chars: first item is h
//Can use the convertArrayToList method for booleans: first item is true
//Can use the convertArrayToList method for integers: first item is 1
