package gr.aueb.cf.ch4;

/**
 * Εμφανίζει 10 σειρές με
 * 10 αστεράκια η κάθε σειρά.
 */
public class StarsHV10App {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
