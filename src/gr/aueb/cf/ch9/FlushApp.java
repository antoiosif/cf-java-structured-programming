package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FlushApp {

    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("C:/Users/IT/jtmp/file-out.txt");
            pw.print("Hello");
            pw.flush();   // ρητό flush
//            pw.close();   // κλείνει το αρχείο
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
