package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Αντγράφει ένα αρχείο εικόνας και ταυτόχρονα υπολογίζει
 * το χρόνο αντιγραφής. Χρησιμοποιεί FileInputStream και
 * FileOutputStream διαβάζοντας και γράφοντας ένα byte
 * τη φορά.
 */
public class IOImageCopy1 {

    public static void main(String[] args) {
        int b, count = 0;
        long start, end, elapsed = 0L;

        try (FileInputStream in = new FileInputStream("C:/Users/IT/jtmp/kefali.jpg");
             FileOutputStream out = new FileOutputStream("C:/Users/IT/jtmp/kefali-copy1.jpg")) {
            start = System.currentTimeMillis();
            while ((b = in.read()) != -1) {
                out.write(b);
                count++;
            }
            end = System.currentTimeMillis();
            elapsed = end - start;
            System.out.printf("Το αρχείο με μέγεθος %d Kbytes (%d bytes) αντιγράφηκε επιτυχώς.%n", count/1024, count);
            System.out.printf("Time: %.2f seconds", elapsed / 1000.0);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
