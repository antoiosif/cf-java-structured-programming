package gr.aueb.cf.ch9;

import java.io.*;

/**
 * Το πρόγραμμα αυτό επιδεικνύει πώς κάνουμε append (δηλ. γράφουμε στο τέλος)
 * σε ένα αρχείο. Παρατηρήστε την FileOutputStream, που παίρνει το όνομα του αρχείου
 * αλλά και μία παράμετρο true που είναι το append.
 *
 * Θα τρέξουμε δύο φορές αυτό το πρόγραμμα και
 * αναμένουμε δύο εγγραφές σε κάθε αρχείο.
 */
public class IOAppend {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream("C:/Users/IT/jtmp/file-out.txt", true));
        PrintWriter pw = new PrintWriter(new FileOutputStream("C:/Users/IT/jtmp/file-out2.txt", true));

        ps.println("Hello from Printstream");
        pw.println("Hello from PrintWriter");

        ps.close();
        pw.close();
    }
}
