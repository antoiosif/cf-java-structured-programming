package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Μόνο δύο αριθμοί κερδίζουν.
 * 0ι 5 και ο 12. Το 70 είναι ουδέτερο.
 */

public class WinApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNumber = 0;

        while (true) {
            System.out.println("Please give the lucky number");
            inputNumber = in.nextInt();

            if ((inputNumber == 5) || (inputNumber == 12)) {
                System.out.println("Found: " + inputNumber);
                break;
            } else {
                System.out.println("No lucky number given");
            }
        }
    }
}
