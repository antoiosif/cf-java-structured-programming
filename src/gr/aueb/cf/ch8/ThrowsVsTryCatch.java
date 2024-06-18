package gr.aueb.cf.ch8;

import java.io.IOException;

/**
 * Checked exceptions could be addressed
 * throwing the exception to the caller.
 */
public class ThrowsVsTryCatch {

    public static void main(String[] args) throws IOException {
        char ch = (char) System.in.read();
    }
}
