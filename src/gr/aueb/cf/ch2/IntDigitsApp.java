package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Βρίσκει τα ψηφία ενός διψήφιου ακεραίου
 * και τα προσθέτει.
 */

public class IntDigitsApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int inputNum;
        int leftDigit = 0, rightDigit = 0, sum = 0;

        System.out.println("Παρακαλώ δώστε έναν διψήφιο αριθμό.");
        inputNum = in.nextInt();
        leftDigit = inputNum / 10;
        rightDigit = inputNum % 10;
        sum = leftDigit + rightDigit;

        System.out.printf("Το άθροισμα των ψηφίων του %d είναι %d.", inputNum, sum);
    }
}
