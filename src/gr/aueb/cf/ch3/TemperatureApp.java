package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβάζει από το standard in ένα ακέραιο
 * που συμβολίζει μία θερμοκρασία και ελέγχει
 * αν η θερμοκρασία είναι μικρότερη από 0.
 * Εκτυπώνει το αποτέλεσμα.
 */
public class TemperatureApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTempBelowZero = false;
        int temp = 0;

        System.out.println("Please insert the temperature (integer)");
        temp = in.nextInt();

        isTempBelowZero = (temp < 0);

        System.out.println("Temperature is below zero: " + isTempBelowZero);
    }
}
