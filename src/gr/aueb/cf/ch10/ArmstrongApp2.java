package gr.aueb.cf.ch10;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Βρίσκει αν το άθροισμα των δυνάμεων κάθε ψηφίου εις τη (πλήθος ψηφίων)
 * είναι ίσο με τον ίδιο τον αριθμό. Για παράδειγμα, ο αριθμός 153 = 1^3 + 5^3 + 3^3.
 * Επομένως, το 153 είναι Armstrong number. Επίσης, τα 370, 371, 407.
 */
public class ArmstrongApp2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final List<Integer> digits = new ArrayList<>();
        int inputNum = 0;
        int digitsCount = 0;
        int sum = 0;
        int num = 0;
        int digit = 0;
        boolean isArmstrong = false;

        while (true) {
            try {
                System.out.println("Please insert a number (int).");
                inputNum = in.nextInt();
                break;
            } catch (InputMismatchException e) {
                in.nextLine();
                System.out.println("Error. The input data is not an int.");
            }
        }

        if (inputNum < 0) {
            System.out.println("Negative numbers are not Armstrong.");
            return;
        }
        num = inputNum;

        // Find digits count
        while (num > 0) {
            digitsCount++;
            digit = num % 10;
            digits.add(digit);
            num /= 10;
        }

        // Find the sum
        for (int item : digits) {
            sum += Math.pow(item, digitsCount);
        }

        isArmstrong = (sum == inputNum);
        System.out.println("Number is: " + inputNum);
        System.out.println("Sum is: " + sum);
        System.out.printf("%d is Armstrong: %s\n", inputNum, isArmstrong);
    }
}
