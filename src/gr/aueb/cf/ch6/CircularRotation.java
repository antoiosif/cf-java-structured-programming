package gr.aueb.cf.ch6;

public class CircularRotation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println("Initial Array");
        print(arr);
        System.out.println();

        int[] leftRotated = doCircularLeftShiftBy(arr, 2);
        System.out.println("Left Rotated by 2");
        print(leftRotated);
        System.out.println();

        int[] rightRotated = doCircularRightShiftBy(arr, 3);
        System.out.println("Right Rotated by 3");
        print(rightRotated);
    }

    public static void print(int[] arr) {
        if (arr == null || arr.length == 0) return;
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    /**
     * Rotates the elements of an array counterclockwise by an offset.
     *
     * @param arr       the given array of integers.
     * @param offset    the distance to rotate.
     * @return          the rotated array, or null if the
     *                  given array is null.
     */
    public static int[] doCircularLeftShiftBy(int[] arr, int offset) {
        if (arr == null) return null;
        if (offset < 0) return null;
        int[] leftRotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            leftRotated[i] = arr[(i + offset) % arr.length];
        }

        return leftRotated;
    }

    /**
     * Rotates the elements of an array clockwise by an offset.
     *
     * @param arr       the given array of integers.
     * @param offset    the distance to rotate.
     * @return          the rotated array, or null if the
     *                  given array is null.
     */
    public static int[] doCircularRightShiftBy(int[] arr, int offset) {
        if (arr == null) return null;
        if (offset < 0) return null;
        int[] rightRotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rightRotated[(i + offset) % arr.length] = arr[i];
        }

        return rightRotated;
    }
}
