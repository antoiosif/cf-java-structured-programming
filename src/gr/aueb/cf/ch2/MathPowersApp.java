package gr.aueb.cf.ch2;

import java.util.Scanner;

public class MathPowersApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputNum;
        int squareNum, cubeNum;

        System.out.println("Παρακαλώ δώστε έναν αριθμό:");
        inputNum = in.nextInt();

        squareNum = (int) Math.pow(inputNum, 2);
        cubeNum = (int) Math.pow(inputNum, 3);

        System.out.printf("Το τετράγωνο του %d είναι %d και ο κύβος %d.", inputNum, squareNum, cubeNum);
    }
}


