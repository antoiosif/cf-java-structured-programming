package gr.aueb.cf.ch10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Βρίσκει αν το άθροισμα των δυνάμεων κάθε ψηφίου εις τη (πλήθος ψηφίων)
 * είναι ίσο με τον ίδιο τον αριθμό. Για παράδειγμα, ο αριθμός 153 = 1^3 + 5^3 + 3^3.
 * Επομένως, το 153 είναι Armstrong number. Επίσης, τα 370, 371, 407.
 */
public class ArmstrongApp {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        final List<Integer> digits = new ArrayList<>();
        int inputNum = 0;
        int digitsCount = 0;
        int sum = 0;
        int num = 0;
        int digit = 0;
        boolean isArmstrong = false;

        System.out.println("Please insert a number (int)");
        inputNum = in.nextInt();
        num = inputNum;

        // Find digits count
        do {
            digitsCount++;
            digit = num % 10;
            digits.add(digit);
            num /= 10;
        } while (num != 0);

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
