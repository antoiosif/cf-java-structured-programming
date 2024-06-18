package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Βρίσκει το μέγιστο τριών ακεραίων
 * που δίνει ο χρήστης.
 */

public class MaxOfThreeApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputNum1 = 0, inputNum2 = 0, inputNum3 = 0;

        System.out.println("Please insert three numbers to find the max.");
        inputNum1 = in.nextInt();
        inputNum2 = in.nextInt();
        inputNum3 = in.nextInt();

        System.out.printf("Max between %d, %d and %d is %d.", inputNum1, inputNum2, inputNum3, Math.max(inputNum1, Math.max(inputNum2, inputNum3)));
    }
}
