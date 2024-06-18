package gr.aueb.cf.ch6;

/**
 * Moves elements one position to the left.
 * Last element becomes zero. Essentially,
 * replaces each array element with the next one.
 */
public class ArrayReplaceWithNextWithMethod {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};

        printArray(arr);
        System.out.println();
        shiftLeftByOne(arr, 0);
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    /**
     * Replaces each array element with the next one
     * starting at a particular position.
     *
     * @param arr       the source array
     * @param low       the position to start
     */
    public static void shiftLeftByOne(int[] arr, int low) {
        if (arr == null) return;
        if ((low < 0) || (low > arr.length - 1)) return;

        for (int i = low; i < arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }

        arr[arr.length - 1] = 0;
    }
}
