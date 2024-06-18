package gr.aueb.cf.ch5;

import java.io.IOException;
import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των γραμμάτων καθώς
 * και το πλήθος των διπλών γραμμάτων (# for end).
 */
public class CharCountAndDuplicatesApp {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        char inputChar = ' ';
        int count = 0;
        int duplicates = 0;
        char previousChar = '\u007f';       // 7F = DEL (δίνουμε μία μη έγκυρη τιμή)

        do {
            inputChar = (char) System.in.read();
            if (inputChar == '#') {
                break;
            }
            count++;
            if (inputChar == previousChar) {
                duplicates++;
            }
            previousChar = inputChar;
        } while (true);

        System.out.println("Count: " + count);
        System.out.println("Duplicates: " + duplicates);
    }
}
