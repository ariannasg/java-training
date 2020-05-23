package essentials;

// A method is overloaded when it has more than one purpose.
// Overloading means to have methods with the same name but with different signatures
public class Overloading {
    // the addValues method is overloaded
    public static int addValues(int i1, int i2) {
        return i1 + i2;
    }

    public static int addValues(int i1, int i2, int i3) {
        return i1 + i2 + i3;
    }

    // the ... means I can receive multiple number of values -> this is called varargs or variable length arguments
    public static int addValues(int... values) {
        var result = 0;

        for (var value : values) {
            result += value;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(addValues(2, 2)); // uses line 7
        System.out.println(addValues(2, 2, 2)); // uses line 11
        System.out.println(addValues(2, 2, 2, 2));  // uses line 16
        System.out.println(addValues(2, 2, 2, 2, 2, 2, 2)); // uses line 16
    }
}

//CONSOLE OUTPUT:
//4
//6
//8
//14
