package basics;

import java.util.InvalidPropertiesFormatException;

public class Student {
    String firstName;
    String lastName;
    int expectedGraduationYear;
    double GPA;
    boolean declaredMayor;

    public Student(
            String firstName,
            String lastName,
            int expectedGraduationYear,
            double GPA,
            boolean declaredMayor
    ) throws InvalidPropertiesFormatException {
        if (firstName.isBlank()) {
            throw new InvalidPropertiesFormatException("Invalid input, the first name can not be blank");
        }

        if (lastName.isBlank()) {
            throw new InvalidPropertiesFormatException("Invalid input, the last name can not be blank");
        }

        if (expectedGraduationYear < 2020 || expectedGraduationYear > 2030) {
            throw new InvalidPropertiesFormatException(
                    "Invalid input, the expected graduation year can only be between 2020 and 2030"
            );
        }

        if (GPA < 0 || GPA > 10) {
            throw new InvalidPropertiesFormatException(
                    "Invalid input, the GPA can only be between 0 and 10"
            );
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.expectedGraduationYear = expectedGraduationYear;
        this.GPA = GPA;
        this.declaredMayor = declaredMayor;
    }

    public void incrementExpectedGraduationYear() {
        this.expectedGraduationYear += 1;
    }

    public String isDeclaredMayor() {
        if (this.declaredMayor) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) throws InvalidPropertiesFormatException {
        Student student1 = new Student(
                "Maria",
                "Gonzalez",
                2020,
                9.8,
                false
        );

        System.out.println("STUDENT 1");
        System.out.println("First name: " + student1.firstName);
        System.out.println("Last name: " + student1.lastName);
        System.out.println("Expected graduation year: " + student1.expectedGraduationYear);
        System.out.println("GPA: " + student1.GPA);
        System.out.println("Declared mayor: " + student1.isDeclaredMayor());

        Student student2 = new Student(
                "Joh",
                "Smith",
                2020,
                9.2,
                true
        );

        System.out.println("\nSTUDENT 2");
        System.out.println("First name: " + student2.firstName);
        System.out.println("Last name: " + student2.lastName);
        System.out.println("Expected graduation year: " + student2.expectedGraduationYear);
        System.out.println("GPA: " + student2.GPA);
        System.out.println("Declared mayor: " + student2.isDeclaredMayor());
        student2.incrementExpectedGraduationYear();
        System.out.println("Increased the expected graduation year, now is: " + student2.expectedGraduationYear);

        System.out.println("\nSTUDENT 3");
        try {
            new Student("", "", 0, -1, false);
        } catch (InvalidPropertiesFormatException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nSTUDENT 4");
        try {
            new Student("A", "", 0, -1, false);
        } catch (InvalidPropertiesFormatException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nSTUDENT 5");
        try {
            new Student("A", "G", 1980, -1, false);
        } catch (InvalidPropertiesFormatException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nSTUDENT 6");
        try {
            new Student("A", "G", 2025, -1, false);
        } catch (InvalidPropertiesFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}

//CONSOLE OUTPUT:
//STUDENT 1
//First name: Maria
//Last name: Gonzalez
//Expected graduation year: 2020
//GPA: 9.8
//Declared mayor: No
//
//STUDENT 2
//First name: Joh
//Last name: Smith
//Expected graduation year: 2020
//GPA: 9.2
//Declared mayor: Yes
//Increased the expected graduation year, now is: 2021
//
//STUDENT 3
//Invalid input, the first name can not be blank
//
//STUDENT 4
//Invalid input, the last name can not be blank
//
//STUDENT 5
//Invalid input, the expected graduation year can only be between 2020 and 2030
//
//STUDENT 6
//Invalid input, the GPA can only be between 0 and 10