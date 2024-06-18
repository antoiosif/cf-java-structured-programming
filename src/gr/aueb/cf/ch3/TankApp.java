package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει true/false από το stαndard in για δύο
 * δεξαμενές. Αν και οι δύο έχουν καύσιμα < 1/4 τότε
 * ανάβει κόκκινη ένδειξη. Αν η μία από τις δύο έχει < 1/4 τότε
 * ανάβει πορτοκαλί ένδειξη.
 */
public class TankApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isLTQuarterTank1 = false;
        boolean isLTQuarterTank2 = false;
        boolean isOrange = false;
        boolean isRed = false;

        System.out.println("Please insert if tank 1 is LT quarter");
        isLTQuarterTank1 = in.nextBoolean();
        System.out.println("Please insert if tank 2 is LT quarter");
        isLTQuarterTank2 = in.nextBoolean();

        isOrange = isLTQuarterTank1 ^ isLTQuarterTank2;
        isRed = isLTQuarterTank1 && isLTQuarterTank2;

        System.out.println("Orange: " + isOrange + " Red: " + isRed);
    }
}
