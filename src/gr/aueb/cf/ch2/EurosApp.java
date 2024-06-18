package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EurosApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int euros500, euros100, euros50, euros20, euros10, euros5;
        int inputEuros;
        int remainingEuros;

        // Εντολές
        System.out.println("Please insert the amount (in euros)");
        inputEuros = in.nextInt();
        remainingEuros = inputEuros;

        euros500 = remainingEuros / 500;
        remainingEuros %= 500;

        euros100 = remainingEuros / 100;
        remainingEuros %= 100;

        euros50 = remainingEuros / 50;
        remainingEuros %= 50;

        euros20 = remainingEuros / 20;
        remainingEuros %= 20;

        euros10 = remainingEuros / 10;
        remainingEuros %= 10;

        euros5 = remainingEuros / 5;
        remainingEuros %= 5;

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("%d Euros = euros500: %d, euros100: %d, euros50: %d, euros20: %d, euros10: %d, euros5: %d, euros: %d",
                inputEuros, euros500, euros100, euros50, euros20, euros10, euros5, remainingEuros);
    }
}
