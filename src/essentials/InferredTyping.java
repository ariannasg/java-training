package essentials;

public class InferredTyping {
    public static void printType(String x) {
        System.out.println(x + " is a string");
    }
    public static void printType(int x) {
        System.out.println(x + " is an int");
    }
    public static void printType(double x) {
        System.out.println(x + " is an double");
    }
    public static void printType(boolean x) {
        System.out.println(x + " is a boolean");
    }

    public static void main(String[] args) {
        var a = "hello";
        printType(a);
        var b = 1;
        printType(b);
        var c = 1.0;
        printType(c);
        var d = true;
        printType(d);
    }
}

//CONSOLE OUTPUT:
//hello is a string
//1 is an int
//1.0 is an double
//true is a boolean