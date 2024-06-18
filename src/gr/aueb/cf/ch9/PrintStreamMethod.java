package gr.aueb.cf.ch9;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamMethod {

    public static void main(String[] args) {
        try {
            PrintStream ps = new PrintStream("C:/Users/IT/jtmp/file-out.txt");

            printMsg(ps, "Hello Coding Plus");          // print to ps
            printMsg(System.out, "Coding Factory");     // print to stout
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Prints a string message to PrintStream.
     *
     * @param ps            the PrintStream object.
     * @param message       the message to print.
     */
    public static void printMsg(PrintStream ps, String message) {
        ps.println(message);
    }
}
