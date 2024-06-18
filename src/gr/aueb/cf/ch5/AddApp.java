package gr.aueb.cf.ch5;

/**
 * Προσθέτει δύο ακεραίους με τη χρήση
 * μεθόδου.
 */
public class AddApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = 0;

        sum = add(a,b);

        System.out.println("Sum = " + sum);
    }

    /**
     * Adds two integers.
     *
     * @param a     the first integer
     * @param b     the second integer
     * @return      the sum of the two integers
     */
    public static int add(int a, int b) {
        // Δήλωση και αρχικοποίηση
        int sum = 0;

        // Εντολές
        sum = a + b;

        //Επιστροφή αποτελέσματος
        return sum;
    }
}
