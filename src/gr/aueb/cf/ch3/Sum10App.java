package gr.aueb.cf.ch3;

/**
 * Υπολογίζει το άθροισμα των 10 πρώτων
 * αριθμών, από το 1-10.
 */
public class Sum10App {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i <= 10) {
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }
}
