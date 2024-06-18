package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ArithmeticExceptionWithStateTest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please insert a numerator (0 for quit) and a denominator");
            numerator = in.nextInt();
            if (isZero(numerator)) break;   // a condition for exit
            denominator = in.nextInt();
            if (isZero(denominator)) {      // if (denominator == 0)
                System.out.println("Please insert a valid denominator");
                continue;
            }
            result = numerator / denominator;
            System.out.printf("%d / %d = %d\n", numerator, denominator, result);
        }
        System.out.println("Thanks for using the app");
    }

    /**
     * State-testing method for zero.
     *
     * @param num   the number to check for.
     * @return      true, if the num is zero, false otherwise.
     */
    public static boolean isZero(int num) {
        return num == 0;
    }
}
