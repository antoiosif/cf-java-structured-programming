package gr.aueb.cf.ch5;

/**
 * Ορίζει την power(int a, int n) που
 * υπολογίζει το a^n.
 */
public class PowerRecursiveApp {

    public static void main(String[] args) {
        int a = 2;
        int n = 4;

        System.out.println(power(a,n));
    }

    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            return a * power(a, n-1);
        }
    }
}
