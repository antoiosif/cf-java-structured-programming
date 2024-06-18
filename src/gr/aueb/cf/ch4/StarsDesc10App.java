package gr.aueb.cf.ch4;

/**
 * Εμφανίζει 10 αστεράκια στη 1η σειρά,
 * 9 αστεράκια στη 2η σειρά, μέχρι 1
 * αστεράκι στη 10η σειρά.
 */
public class StarsDesc10App {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = i; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
