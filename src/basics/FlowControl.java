package basics;

import java.util.Scanner;

public class FlowControl {
    public static void main(String[] args) {
        System.out.println("Pick a number between 1 and 10");

        Scanner input = new Scanner(System.in); // scanner has ops that allow us to get inputs
        int number = input.nextInt();

        if (number < 5) {
            System.out.println("Enjoy the good luck a friend gives you");
        } else if ( number < 7) {
            System.out.println("Your shoe selection will make you happy today");
        } else {
            System.out.println("No luck");
        }
    }
}

//CONSOLE OUTPUT:
//Pick a number between 1 and 10
//3
//Enjoy the good luck a friend gives you
//Pick a number between 1 and 10
//5
//Your shoe selection will make you happy today
//Pick a number between 1 and 10
//7
//No luck