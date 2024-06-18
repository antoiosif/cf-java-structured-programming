package gr.aueb.cf.ch8;

import java.io.IOException;

/**
 * Checked exceptions could be addressed
 * using try/catch.
 */
public class ThrowsVsTryCatch2 {

    public static void main(String[] args) {
        try {
            char ch = (char) System.in.read();
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }
}
