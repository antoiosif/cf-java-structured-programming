package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

/**
 * Διαβάζει από ένα αρχείο ακεραίων και γράφει
 * σε ένα άλλο αρχείο το άθροισμα και τον μέσο όρο.
 */
public class IOIntDemo {

    public static void main(String[] args) {
        String token;
        int num = 0;
        int sum = 0;
        int count = 0;
        double average = 0.0;

        try (Scanner in = new Scanner(new File("C:/Users/IT/jtmp/int-in.txt"));
             PrintStream ps = new PrintStream("C:/Users/IT/jtmp/int-out.txt")) {
            while (in.hasNext()) {
                token = in.next();
                if (isInt(token)) {
                    num = Integer.parseInt(token);
                    count++;
                    sum += num;
                }
            }
            average = (double) sum / count;
            ps.printf("Το άθροισμα είναι %d%n", sum);
            ps.printf(Locale.US, "Ο μέσος όρος είναι %.2f", average);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Ελέγχει αν το String s είναι αριθμός.
     *
     * @param s     το προς έλεγχο String.
     * @return      true, αν το s είναι αριθμός, αλλιώς false.
     */
    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
