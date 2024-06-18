package gr.aueb.cf.ch9;

import java.io.*;

/**
 * Αντγράφει ένα αρχείο βίντεο και ταυτόχρονα υπολογίζει το χρόνο
 * αντιγραφής. Χρησιμοποιεί BufferedInputStream, BufferedOutputStream,
 * FileInputStream, FileOutputStream διαβάζοντας και γράφοντας 8192 bytes
 * (= 8 Kbytes) τη φορά.
 */
public class IOImageCopy3 {

    public static void main(String[] args) {
        int b, count = 0;
        long start, end, elapsed = 0L;
        byte[] buf = new byte[4096];

        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream("C:/Users/IT/jtmp/kefali.jpg"));
             BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("C:/Users/IT/jtmp/kefali-copy3.jpg"))) {
            start = System.currentTimeMillis();
            while ((b = in.read(buf, 0, buf.length - 1)) != -1) {
                out.write(buf, 0, b);
                count += b;
            }
            end = System.currentTimeMillis();
            elapsed = end - start;
            System.out.printf("Το αρχείο με μέγεθος %d Kbytes (%d bytes) αντιγράφηκε επιτυχώς.%n", count/1024, count);
            System.out.printf("Time: %.3f seconds", elapsed / 1000.0);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
