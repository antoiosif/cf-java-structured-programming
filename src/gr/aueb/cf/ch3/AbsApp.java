package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εισάγει ο χρήστης έναν ακέραιο και
 * εκτυπώνει το απόλυτο.
 */
public class AbsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int absNum = 0;

        System.out.println("Please insert a number");
        inputNum = in.nextInt();

        absNum = (inputNum >= 0) ? inputNum : -inputNum;

        System.out.printf("Abs of %d is: %d", inputNum, absNum);
    }
}
