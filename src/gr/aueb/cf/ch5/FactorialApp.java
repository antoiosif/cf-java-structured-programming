package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το παραγοντικό του n
 * με τη χρήση της μεθόδου facto(n).
 * n! = 1 * 2 * 3 * ... * n
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please insert an int");
        n = in.nextInt();

        System.out.printf("%d! = %,d", n, facto(n));
    }

    /**
     * Iterative version of n!
     *
     * @param n     the n number of n!
     * @return      1*2*...*n
     */
    public static int facto(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
