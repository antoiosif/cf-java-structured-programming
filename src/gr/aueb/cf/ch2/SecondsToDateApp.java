package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διαβάζει από το χρήστη έναν ακέραιο που αντιστοιχεί στο
 * πλήθος δευτερολέπτων και μετατρέπει σε ημέρες, ώρες, λεπτά
 * και δευτερόλεπτα και εκτυπώνει το αποτέλεσμα στην οθόνη.
 */

public class SecondsToDateApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int SECS_PER_DAY = 24 * 60 *60;
        final int SECS_PER_HOUR = 60 * 60;
        final int SECS_PER_MINUTE = 60;
        int inputSeconds = 0;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int remainingSeconds = 0;

        System.out.println("Please insert the count of Seconds:");
        inputSeconds = in.nextInt();

        days = inputSeconds / SECS_PER_DAY;
        remainingSeconds = inputSeconds % SECS_PER_DAY;

        hours = remainingSeconds / SECS_PER_HOUR;
        remainingSeconds %= SECS_PER_HOUR;

        minutes = remainingSeconds / SECS_PER_MINUTE;
        remainingSeconds %= SECS_PER_MINUTE;

        System.out.printf("Total Seconds: %,d, Days: %d, Hours: %02d, Minutes: %02d, Seconds: %02d",
                inputSeconds, days, hours, minutes, remainingSeconds);
    }
}
