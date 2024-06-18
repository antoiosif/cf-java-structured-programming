package gr.aueb.cf.ch10;

import java.util.Scanner;

public class MaxZerosShift {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int count = 0;
        boolean oneFlag = false;
        int max = 0;

        System.out.println("Please insert a number");
        n = in.nextInt();

        for (; n > 0; n >>= 1) {
            // if rightmost bit is one
            if (n % 2 != 0) {
                oneFlag = true;
                if (count > max) max = count;
                count = 0;
            } else if (oneFlag) count++;
        }
        System.out.println("Zeros: " + max);
    }
}
