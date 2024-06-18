package gr.aueb.cf.ch3;

/**
 * Ο χρήστης μαντεύει ένα μυστικό
 * αριθμό (secret).
 */

import java.util.Scanner;

public class BingoApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECRET = 12;
        int num = 0;
        boolean isBingo = false;

        do {
            System.out.println("Please insert a num and guess the secret");
            num = in.nextInt();

            if (num == SECRET) {
                System.out.println("Bingo!!!");
                isBingo = true;
            } else {
                System.out.println("Try Again");
            }
        } while (!isBingo);
    }
}
