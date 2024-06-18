package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δέχεται ως είσοδο: 1) Σύνολο βαθμολογίας
 * και 2) πλήθος μαθημάτων, και υπολογίζει
 * τον μέσο όρο. Στη συνέχεια δίνει feedback
 * στον χρήστη: 9-10 Άριστα, 7-8 Καλώς,
 * 5-6 Λίαν καλώς, κάτω από 5 Αποτυχία.
 */
public class GradesApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalGrades = 0;
        int gradesCount = 0;
        int average = 0;

        System.out.println("Please insert total grades and grades count");
        totalGrades = in.nextInt();
        gradesCount = in.nextInt();

        if (gradesCount == 0) {
            System.out.println("Grades count can not be zero");
            System.exit(1);
        }

        average = totalGrades / gradesCount;

        if (average < 0 || average > 10 ){
            System.out.println("Error in input data");
            System.exit(1);
        } else if (average >= 9) {
            System.out.println("Excellent: " + average);
        } else if (average >= 7) {
            System.out.println("Very good: " + average);
        } else if (average >= 5) {
            System.out.println("Good: " + average);
        } else {
            System.out.println("Fail: " + average);
        }
    }
}
