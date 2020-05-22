package basics;

public class Strings {
    public static void main(String[] args) {
        String studentFirstName = "Kayla";
        String studentLastName = "Hammon";

        System.out.println(studentFirstName);
        System.out.println(studentLastName);

        System.out.println("String operators");
        char studentFirstInitial = studentFirstName.charAt(0);
        System.out.println(studentFirstInitial);
        char studentLastInitial = studentLastName.charAt(0);
        System.out.println(studentLastInitial);

        double studentGPA = 3.45;
        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of: " + studentGPA);
    }
}

//CONSOLE OUTPUT:
//Kayla
//Hammon
//String operators
//K
//H
//Kayla Hammon has a GPA of: 3.45