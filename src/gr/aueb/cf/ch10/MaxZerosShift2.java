package gr.aueb.cf.ch10;

import java.util.Scanner;

public class MaxZerosShift2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        System.out.println("Please insert a number");
        num = in.nextInt();
        System.out.println("Zeros: " + maxZerosBetweenOnes(num));
    }

    public static int maxZerosBetweenOnes(int num) {
        String binaryNum;
        int count = 0;
        int maxZeros = 0;
        boolean isOne = false;

        binaryNum = Integer.toBinaryString(num);
        for (int i = 0; i < binaryNum.length(); i++) {
            if (binaryNum.charAt(i) == '1') {
                isOne = true;
                if (count > maxZeros) maxZeros = count;
                count = 0;
            } else if (isOne) count++;
        }
        return maxZeros;
    }
}
