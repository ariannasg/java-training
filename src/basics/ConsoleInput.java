package basics;

import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        double studentGPA = 3.45;
        String studentFirstName = "Kayla";
        String studentLastName = "Hammon";

        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of: " + studentGPA);
        System.out.println("What do you want to update it to?");

        Scanner input = new Scanner(System.in); // scanner has ops that allow us to get inputs
        studentGPA = input.nextDouble();
        System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of: " + studentGPA);
    }
}

//CONSOLE OUTPUT:
//Kayla Hammon has a GPA of: 3.45
//What do you want to update it to?
//4.0
//Kayla Hammon now has a GPA of: 4.0