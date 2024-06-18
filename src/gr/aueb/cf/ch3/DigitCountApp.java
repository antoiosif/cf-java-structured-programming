package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των ψηφίων ενός
 * ακεραίου, με do/while. Για παράδειγμα,
 * αν ο χρήστης δώσει το 259 τότε το πλήθος
 * των ψηφίων είναι 3.
 */
public class DigitCountApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int num = 0;
        int count = 0;
        int sumOfDigits = 0;

        System.out.println("Please insert a number (int)");
        inputNum = in.nextInt();
        num = inputNum;

        do {
            count ++;
            sumOfDigits += num % 10;
            num /= 10;
        } while (num != 0);

        System.out.println("Digit-count: " + count);
        System.out.println("Sum of digits: " + sumOfDigits);
    }
}