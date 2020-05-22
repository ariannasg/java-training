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
    }
}

//CONSOLE OUTPUT:
//Playing current song
//Would you like to take this song off of repeat? If so, answer yes
//no
//Playing current song
//Would you like to take this song off of repeat? If so, answer yes
//no
//Playing current song
//Would you like to take this song off of repeat? If so, answer yes
//yes
//Playing next song
