package gr.aueb.cf.ch8;

import java.io.IOException;

public class MethodReadCharException {

    public static void main(String[] args) {
        char ch;

        try {
            ch = readChar();
            System.out.println(ch);
        } catch (IOException e) {
            System.out.println("char read error");  // user friendly message
        }
    }

    /**
     * Returns one char.
     *
     * @return              one char.
     * @throws IOException  if I/O error.
     */
    public static char readChar() throws IOException {
        try {
            return (char) System.in.read();
        } catch (IOException e) {
            System.err.println(e.getMessage());     // Logging
            throw e;                                // rethrow to caller
        }
    }
}
