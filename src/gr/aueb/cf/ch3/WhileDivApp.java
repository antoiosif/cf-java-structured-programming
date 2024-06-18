package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *  Ο χρήστης εισάγει δύο ακεραίους μέχρι
 *  ο αριθμητής να είναι μηδέν.
 *  Το πρόγραμμα ελέγχει τον παρονομαστή αν είναι
 *  0, και αν είναι 0 δίνει τη δυνατότητα στο χρήστη
 *  να συνεχίσει δίνοντας παρανομαστή διάφορο του 0.
 */
public class WhileDivApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;


        while (true) {
            System.out.println("Please insert two integers for division (numerator 0 for exit)");
            numerator = in.nextInt();
            denominator = in.nextInt();

            if (numerator == 0) {
                System.out.println("Numerator is zero.");
                break;
            }

            if (denominator == 0) {
                System.out.println("Denominator should not be zero.");
                continue;
            }

            result = numerator / denominator;
            System.out.printf("%d / %d = %d\n", numerator, denominator, result);
            break;
        }
        System.out.println("Thanks for using our app!");
    }
}
