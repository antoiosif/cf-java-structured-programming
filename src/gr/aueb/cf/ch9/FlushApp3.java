package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FlushApp3 {

    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter("C:/Users/IT/jtmp/file-out.txt");
             Scanner in = new Scanner(System.in)) {
            pw.print("Hello");
            pw.flush();     // κάνουμε ρητό flush αλλιώς θα γινόταν αυτόματο μόλις τελειώσει το πρόγραμμα και κλείσει το αρχείο
            System.out.println("Insert something to continue");
            in.nextLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
