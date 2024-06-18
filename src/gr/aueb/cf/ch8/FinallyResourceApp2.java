package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * try/catch/finally closing resources.
 */
public class FinallyResourceApp2 {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        int num = 0;

        try (Scanner in = new Scanner (System.in)){
            num = in.nextInt();
            System.out.println();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
