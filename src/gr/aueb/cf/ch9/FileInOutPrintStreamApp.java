package gr.aueb.cf.ch9;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileInOutPrintStreamApp {

    public static void main(String[] args) {
        File fdIn = new File("C:/Users/IT/jtmp/file-gr.txt");
        File fdOut = new File("C:/Users/IT/jtmp/file-out.txt");
        String line;
        String[] tokens;

        try (Scanner in = new Scanner(fdIn);
             PrintStream ps = new PrintStream(fdOut, StandardCharsets.UTF_8)) {
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split(" +");

                for (String token : tokens) {
                    ps.printf("%s ", token);
                }
                ps.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
