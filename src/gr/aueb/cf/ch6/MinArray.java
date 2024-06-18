package gr.aueb.cf.ch6;

/**
 * Finds the min element of an array of ints.
 * The initial min value is set to Integer.MAX_VALUE
 * and the initial position to 0.
 */
public class MinArray {

    public static void main(String[] args) {
        int[] arr = {7, 3, 9, 6, 2, 12};
        int minPosition;

        minPosition = findMin(arr);
        System.out.printf("Min value: %d, Min position: %d", arr[minPosition], minPosition + 1);
    }

    /**
     * Returns the position of the min element.
     *
     * @param arr
     * @return
     */
    public static int findMin(int[] arr) {
        // Ορίζουμε ως min value το max-int, οπότε κάποιο στοιχείο θα είναι
        // μικρότερο από max-int εκτός αν όλα τα στοιχεία του πίνακα είναι max-int,
        // οπότε τότε το position παραμένει 0, που είναι σωστό.
        int minValue = Integer.MAX_VALUE;
        int minPosition = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }
}
