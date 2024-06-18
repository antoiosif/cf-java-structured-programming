package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * Εκτυπώνει σε αρχείο χαρακτήρες με τη χρήση
 * των PrintStream και PrintWriter.
 */
public class IOFilePrint {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/Users/IT/jtmp/file-out.txt");
             PrintWriter pw = new PrintWriter("C:/Users/IT/jtmp/file-out2.txt")) {
            ps.println("Hello World2! from PrintStream");
            pw.println("Hello World2! from PrintWriter");
        } catch (FileNotFoundException e) {
            System.out.println("Το αρχείο δεν βρέθηκε");
        }
    }
}
