package gr.aueb.cf.ch8;

import java.io.IOException;

/**
 * Checked exceptions could be addressed
 * using try/catch and rethrow.
 */
public class ThrowsVsTryCatch3 {

    public static void main(String[] args) throws IOException {
        try {
            char ch = (char) System.in.read();
        } catch (IOException e) {
            System.out.println("IO Exception");
            throw e;
        }
    }
}
