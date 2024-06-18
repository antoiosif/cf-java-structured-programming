package gr.aueb.cf.ch6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Αρχικοποιεί τον πίνακα διαβάζοντας από ένα αρχείο.
 */
public class ArrayPopulateFile {

    public static void main(String[] args) throws FileNotFoundException {
        int[] ages = new int[5];
        File intFile = new File("C:/THANASSIS/myIntFile.txt");
        Scanner in = new Scanner(intFile);

        for (int i = 0; i < ages.length; i++) {
            ages[i] = in.nextInt();
        }

        for (int age : ages) {
            System.out.print(age + " ");
        }

        in.close();
    }
}
