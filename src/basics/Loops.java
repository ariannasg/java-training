package basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        boolean isOnRepeat = true;
        Scanner input = new Scanner(System.in);

        while (isOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song off of repeat? If so, answer yes");

            if (input.next().equals("yes")) {
                isOnRepeat = false;
            }
        }

        System.out.println("Playing next song");


        System.out.println("Now trying with a do loop");

        isOnRepeat = true;
        do {
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song off of repeat? If so, answer yes");

            if (input.next().equals("yes")) {
                isOnRepeat = false;
            }
        } while (isOnRepeat);

        System.out.println("Playing next song");
    }
}


//CONSOLE OUTPUT:
//Playing current song
//Would you like to take this song off of repeat? If so, answer yes
//yes
//Playing next song
//Now trying with a do loop
//Playing current song
//Would you like to take this song off of repeat? If so, answer yes
//n
//Playing current song
//Would you like to take this song off of repeat? If so, answer yes
//n
//Playing current song
//Would you like to take this song off of repeat? If so, answer yes
//yes
//Playing next song
//
//Process finished with exit code 0
