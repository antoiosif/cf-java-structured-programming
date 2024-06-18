package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ορίζει μέθοδο που υπολογίζει το a^n.
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int n = 0;

        System.out.println("Please insert a and n (ints)");
        a = in.nextInt();
        n = in.nextInt();

        System.out.printf("%d^%d = %d", a, n, pow(a,n));
    }

    /**
     * Power a^n.
     *
     * @param a     the base
     * @param n     the power to raise
     * @return      the power of a to n
     */
    public static int pow(int a, int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= a;
        }

        return result;
    }
}
