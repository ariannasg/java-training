package essentials;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Assignment and Mathematical operators");
        int intValue = 10;
        System.out.println(intValue);
        System.out.println("Addition operator: " + (intValue + 5));
        System.out.println("Subtraction operator: " + (intValue - 5));
        System.out.println("Multiplication operator: " + (intValue * 5));
        System.out.println("Division operator: " + (intValue / 5));
        System.out.println("Modulo operator (remainder of the division): " + (intValue % 5));
        intValue++;
        System.out.println("Incrementing using postfix notation: " + (intValue));
        intValue--;
        System.out.println("Decrementing  using postfix notation: " + (intValue));
        System.out.println("Incrementing using prefix notation: " + (++intValue));
        System.out.println("Decrementing using prefix notation: " + (--intValue));

        System.out.println();

        System.out.println("Equality operators");
        System.out.println(intValue == 15);
        System.out.println(intValue != 15);
        System.out.println(intValue > 15);
        System.out.println(intValue < 15);

        System.out.println("Logical operators");
        System.out.println("&&, ||");
        System.out.println("Ternary operator: " + ((intValue == 10) ? "intValue is 10" : "intValue is not 10"));
    }
}

//CONSOLE OUTPUT:
