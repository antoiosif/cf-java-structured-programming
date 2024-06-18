package gr.aueb.cf.ch6;

/**
 * Returns min position of an array.
 */
public class MinArray2 {

    public static void main(String[] args) {
        int[] arr = {7, 6, 2, 9, 10, 4, 6, 6, 7};
        int minPosition = 0;

        minPosition = getMinPosition(arr);
        if (minPosition == -1) {
            System.out.println("Error in searching...");
        } else {
            System.out.printf("Min value: %d, Min position: %d", arr[minPosition], minPosition + 1);
        }
    }

    public static int getMinPosition(int[] arr) {
        if (arr == null || arr.length == 0) return -1;

        // Έστω ότι το ελάχιστο στοιχείο είναι στη θέση 0
        int minPosition = 0;
        int minValue = arr[0];

        // Ξεκινάμε να ελέγχουμε από τη θέση 1. Κάθε φορά που
        // βρίσκουμε μικρότερο στοιχείο από το minValue,
        // ανανεώνουμε minPosition και minValue.
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }

        return minPosition;
    }
}
