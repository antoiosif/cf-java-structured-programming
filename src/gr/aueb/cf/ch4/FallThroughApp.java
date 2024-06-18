package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Λαμβάνει έναν αριθμό που συμβολίζει βαθμό,
 * από τον χρήστη και εμφανίζει κατάλληλο μήνυμα.
 */
public class FallThroughApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.println("Παρακαλώ δώστε αριθμό 1-10");
        num = in.nextInt();

        switch (num) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Κάτω από τη βάση");
                break;
            case 5:
            case 6:
                System.out.println("Καλώς");
                break;
            case 7:
            case 8:
                System.out.println("Λίαν καλώς");
                break;
            case 9:
            case 10:
                System.out.println("Άριστα");
                break;
            default:
                System.out.println("Παρακαλώ δώστε αριθμό 1-10");
                break;
        }
    }
}
