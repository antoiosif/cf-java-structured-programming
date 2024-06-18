package gr.aueb.cf.ch6;

public class AddTwoBigIntegers {

    public static void main(String[] args) {
        int[] arr1 = {5, 3, 8, 7, 6, 9, 5, 3, 6, 1};
        int[] arr2 = {9, 3, 2, 7, 6, 5, 5, 3, 3, 9};
        int[] arrOut;
        arrOut = addTwoInts(arr1, arr2);

        for (int item : arrOut) {
            System.out.print(item + " ");
        }
    }

    public static int[] addTwoInts(int[] arr1, int[] arr2) {
        int[] arrOut;
        int currentSum;
        int carry = 0;

        if ((arr1 == null) || (arr2 == null) || (arr1.length != arr2.length)) throw new IllegalArgumentException();

        arrOut = new int[arr1.length + 1];

        for (int i = arr1.length - 1; i >= 0; i--) {
            currentSum = arr1[i] + arr2[i] + carry;
            arrOut[i+1] = currentSum % 10;
            carry = currentSum / 10;
        }

        arrOut[0] = carry;
        return arrOut;
    }
}