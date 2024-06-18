package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Μετατρέπει μέρες, ώρες, λεπτά και δευτερόλεπτα
 * σε συνολικά δευτερόλεπτα.
 */

public class DHMToSecApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        final int SEC_PER_DAY = 86400;
        final int SEC_PER_HOUR = 3600;
        final int SEC_PER_MINUTE = 60;

        Scanner in = new Scanner(System.in);
        long inputDays, inputHours, inputMinutes, inputSeconds;
        long totalSeconds;

        // Εντολές
        System.out.println("Δώστε Μέρες, Ώρες, Λεπτά και Δευτερόλεπτα:");
        inputDays = in.nextLong();
        inputHours = in.nextLong();
        inputMinutes = in.nextLong();
        inputSeconds = in.nextLong();

        totalSeconds = (inputDays * SEC_PER_DAY) + (inputHours * SEC_PER_HOUR) + (inputMinutes * SEC_PER_MINUTE) + inputSeconds;

        // Εκτύπωση αποτελεσμάτων
        System.out.printf(Locale.US, "Total seconds = %,8d", totalSeconds);

    }
}
