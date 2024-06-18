package gr.aueb.cf.ch5;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            printMenu();
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Εισαγωγή");
                    break;
                case 2:
                    System.out.println("Διαγραφή");
                    break;
                case 3:
                    System.out.println("Αναζήτηση");
                    break;
                case 4:
                    System.out.println("Ενημέρωση");
                    break;
                case 5:
                    System.out.println("Έξοδος");
                    break;
                default:
                    System.out.println("Παρακαλώ εισάγετε 1-5");
                    break;
            }
        } while (choice != 5);
    }

    /**
     * Prints a CRUD menu.
     */
    public static void printMenu () {
        System.out.println("Επιλέξτε ένα από τα παρακάτω");
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Αναζήτηση");
        System.out.println("4. Ενημέρωση");
        System.out.println("5. Έξοδος");
    }
}
