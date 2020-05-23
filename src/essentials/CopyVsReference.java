package essentials;

//Passing by value (or copy) vs passing by reference.
//In java arguments are always passed by copy, but we need to be aware that object variables are references
//to the location in memory of those values, rather than copies
public class CopyVsReference {
    public static void change(int inMethodValue) {
        inMethodValue = 2;
        System.out.println("In method: " + inMethodValue);
    }

    public static void change(int[] inMethodValue) {
        inMethodValue[0] = 2;
        System.out.println("In method: " + inMethodValue[0]);
    }

    public static void change(String inMethodValue) {
        inMethodValue = "dog";
        System.out.println("In method: " + inMethodValue);
    }

    public static void change(String[] inMethodValue) {
        inMethodValue[0] = "dog";
        System.out.println("In method: " + inMethodValue[0]);
    }

    public static void main(String[] args) {
        System.out.println("Trying an int");
        int myInt = 1;
        System.out.println("Before calling method: " + myInt);
        change(myInt);
        System.out.println("After calling method: " + myInt);

        System.out.println("\nTrying an int within an object");
        int[] myInts = {1};
        System.out.println("Before calling method: " + myInts[0]);
        change(myInts);
        System.out.println("After calling method: " + myInts[0]);


        System.out.println("\nTrying a string");
        String myString = "cat";
        System.out.println("Before calling method: " + myString);
        change(myString);
        System.out.println("After calling method: " + myString);

        System.out.println("\nTrying a string within an object");
        String[] myStrings = {"cat"};
        System.out.println("Before calling method: " + myStrings[0]);
        change(myStrings);
        System.out.println("After calling method: " + myStrings[0]);
    }
}

//CONSOLE OUTPUT:
//Trying an int
//Before calling method: 1
//In method: 2
//After calling method: 1
//
//Trying an int within an object
//Before calling method: 1
//In method: 2
//After calling method: 2
//
//Trying a string
//Before calling method: cat
//In method: dog
//After calling method: cat
//
//Trying a string within an object
//Before calling method: cat
//In method: dog
//After calling method: dog
