package gr.aueb.cf.ch9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Auto-flush enabled with FileOutputStream
 */
public class AutoFlushApp {

    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter(new FileOutputStream("C:/Users/IT/jtmp/file-out.txt"), true)) {
            pw.println("Hello");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
