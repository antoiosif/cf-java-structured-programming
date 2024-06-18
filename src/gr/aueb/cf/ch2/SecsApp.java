package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει μέρες, ώρες, λεπτά και δευτερόλεπτα
 * και εκτυπώνει τα συνολικά δευτερόλεπτα.
 */
public class SecsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECS_PER_MINUTE = 60;
        final int SECS_PER_HOUR = 60 * 60;
        final int SECS_PER_DAY = 24 * 60 * 60;
        int inputDays = 0;
        int inputHours = 0;
        int inputMinutes = 0;
        int inputSeconds = 0;
        int totalSeconds = 0;

        System.out.println("Please insert: Days, Hours, Minutes and Seconds");
        inputDays = in.nextInt();
        inputHours = in.nextInt();
        inputMinutes = in.nextInt();
        inputSeconds = in.nextInt();

        totalSeconds = inputDays * SECS_PER_DAY + inputHours * SECS_PER_HOUR + inputMinutes * SECS_PER_MINUTE + inputSeconds;

        System.out.println("Total seconds: " + totalSeconds);
    }
}