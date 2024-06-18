package gr.aueb.cf.ch4;

import java.io.IOException;

/**
 * Demo of reading a char.
 * 1. System.in.read() -> int
 */
public class CharReadApp {

    public static void main(String[] args) throws IOException {
        int inputChar = ' ';

        System.out.println("Please insert a ASCII char");
        inputChar = System.in.read();

        System.out.println("Ordinal: " + inputChar);
        System.out.println("char: " + (char) inputChar);
    }
}
