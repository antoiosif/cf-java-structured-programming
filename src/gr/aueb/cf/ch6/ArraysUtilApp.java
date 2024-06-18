package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ArraysUtilApp {

    public static void main(String[] args) {
        int[] arr = {5, 4, 9, 3, 12, 1};
        int[] arrayCopy;
        int[] arraySecondCopy;

        //Array sort
        Arrays.sort(arr);
        traverse(arr);
        System.out.println();

        // Array copy
        arrayCopy = Arrays.copyOf(arr, arr.length);
        traverse(arrayCopy);
        System.out.println();

        arraySecondCopy = Arrays.copyOfRange(arr, 1, arr.length);
        traverse(arraySecondCopy);
    }

    public static void traverse(int [] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
