package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FlushApp2 {

    public static void main(String[] args) {
        try (PrintWriter pw = new PrintWriter("C:/Users/IT/jtmp/file-out.txt")) {
            pw.print("Hello");  // θα γίνει flush μόλις τελειώσει το πρόγραμμα και κλείσει αυτόματα το αρχείο - autoclose
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
