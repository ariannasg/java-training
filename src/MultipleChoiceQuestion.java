import java.util.Scanner;

public class MultipleChoiceQuestion {
    public static void main(String[] args) {
        String madrid = "Madrid";
        String barcelona = "Barcelona";
        String valencia = "Valencia";

        Scanner input = new Scanner(System.in);
        System.out.println("What is the capital of Spain? " + madrid + ", " + barcelona + " or " + valencia);
        System.out.println("Type in the correct choice");

        while (true) {
            if (input.next().equalsIgnoreCase(madrid)) {
                System.out.println("That's the correct answer");
                break;
            } else {
                System.out.println("That answer is incorrect. Try again");
            }
        }
    }
}

//CONSOLE OUTPUT:
//What is the capital of Spain? Madrid, Barcelona or Valencia
//Type in the correct choice
//valencia
//That answer is incorrect. Try again
//madrid
//That's the correct answer