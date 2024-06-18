package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει από τον χρήστη ένα ακέραιο που
 * συμβολίζει ένα ποσό σε ευρώ και το μετατρέπει
 * με βάση κάποια ισοτιμία (parity) σε US dollars
 * και Us cents.
 */
public class EuroΤοUSConverterApp {

    public static void main(String[] args) {

        // Δήλωση και Αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        final int PARITY = 99; // US cents
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents =0;

        // Εντολές
        System.out.println("Please insert the amount in euros");
        inputEuros = in.nextInt();
        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("%,d euros = %,d total usa cents = %,d usa dollars & %,d usa cents",
                inputEuros, totalUsaCents, usaDollars, usaCents);
    }
}
