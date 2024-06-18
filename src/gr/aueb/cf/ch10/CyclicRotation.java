package gr.aueb.cf.ch10;

public class CyclicRotation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] rotated;

        rotated = doCircularShiftRightBy(arr, 2);
        for (int item : rotated) {
            System.out.print(item + " ");
        }
    }

    public static int[] doCircularShiftRightBy(int[] arr, int offset) {
        int[] rotated = new int[arr.length];


        // We compute the modulus of arr.length, so
        // the equal or greater indexes wrap around
        // circularly.
        for (int i = 0; i < arr.length ; i++) {
            rotated[(i + offset) % arr.length] = arr[i];
        }
        return rotated;
    }
}
