package gr.aueb.cf.ch6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class CombinationsFourDemo {

    public static void main(String[] args) throws FileNotFoundException {
        final int THRESHOLD = 4;
        File inFile = new File("C:/Users/a8ana/OneDrive/CodingFactory-REBOOT/Projects/JAVA/numbers.txt");
        File outFile = new File("C:/Users/a8ana/OneDrive/CodingFactory-REBOOT/Projects/JAVA/combinations.txt");
        Scanner in = new Scanner(inFile);
        PrintStream ps = new PrintStream(outFile);
        int n = 4;
        int[] row = new int[4];

        ArrayList<Integer> numbers = new ArrayList<>();

        while (in.hasNextInt()) {
            numbers.add(in.nextInt());
        }

        for (int i = 0; i <= numbers.size() - n; i++) {
            for (int j = i + 1; j <= numbers.size() - n + 1; j++) {
                for (int k = j + 1; k <= numbers.size() - n + 2; k++) {
                    for (int m = k + 1; m <= numbers.size(); m++) {
                        row[0] = numbers.get(i);
                        row[1] = numbers.get(j);
                        row[2] = numbers.get(k);
                        row[3] = numbers.get(m);

                        if (!isEven(row, THRESHOLD)) {
                            ps.printf("%d\t%d\t%d\t%d\n", numbers.get(i), numbers.get(j), numbers.get(k), numbers.get(m));
                        }
                    }
                }
            }
        }
    }

    /**
     * Checks if a 6-number array contains more than
     * a certain amount of evens.
     *
     * @param row           the source of array ints.
     * @param threshold
     * @return              true, if the count of evens
     *                      is greater than the threshold.
     */
    public static boolean isEven(int[] row, int threshold) {
        int count = 0;

        for (int num : row) {
            if (num % 2 == 0) {
                count++;
            }
        }

        return (count > threshold);
    }
}
