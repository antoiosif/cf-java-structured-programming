package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyResourceApp3 {

    public static void main(String[] args) {
        int num = 0;
        Scanner in = new Scanner(System.in);

        try (in){
            num = in.nextInt();
            System.out.println();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
