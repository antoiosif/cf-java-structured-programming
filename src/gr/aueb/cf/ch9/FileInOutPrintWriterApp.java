package gr.aueb.cf.ch9;

import java.io.File;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileInOutPrintWriterApp {

    public static void main(String[] args) {
        File fdIn = new File("C:/Users/IT/jtmp/file-gr.txt");
        File fdOut = new File("C:/Users/IT/jtmp/file-out.txt");
        String line;
        String[] tokens;

        try (Scanner in = new Scanner(fdIn);
             PrintWriter pw = new PrintWriter(fdOut, StandardCharsets.UTF_8)) {
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split(" +");

                for (String token : tokens) {
                    pw.printf("%s ", token);
                }
                pw.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
