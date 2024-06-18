package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Τα φώτα ενός αυτοκινήτου ανάβουν όταν
 * βρέχει ΚΑΙ ταυτόχρονα είτε είναι σκοτάδι
 * Ή τρέχει με ταχύτητα υψηλή. Ο χρήστης εισάγει
 * τα τρία παραπάνω στοιχεία και το πρόγραμμα εκτυπώνει
 * αν τα φώτα ανάβουν ή όχι.
 */
public class LightsOnApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        boolean areLightsOn = false;
        int speed = 0;
        final int MAX_SPEED = 100;

        System.out.println("Please insert if it is raining");
        isRaining = in.nextBoolean();
        System.out.println("Please insert if it is dark");
        isDark = in.nextBoolean();
        System.out.println("Please insert the speed of the car");
        speed = in.nextInt();

        isRunning = (speed > MAX_SPEED);
        areLightsOn = isRaining && (isDark || isRunning);

        System.out.println("Are Lights on: " + areLightsOn);
    }
}
