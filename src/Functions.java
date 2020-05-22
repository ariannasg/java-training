import java.util.Scanner;

public class Functions {
    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer tea time...");
        System.out.println("Type in any random word and press Enter to start developer tea time");

        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time...");
    }

    public static void main(String[] args) {
        announceDeveloperTeaTime();
    }
}

//CONSOLE OUTPUT:
//Waiting for developer tea time...
//Type in any random word and press Enter to start developer tea time
//s
//It's developer tea time...