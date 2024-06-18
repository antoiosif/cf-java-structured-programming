package gr.aueb.cf.ch6;

/**
 * Finds the max pos and val of an int-array
 * based on a generic method.
 */
public class MaxGenericMethodApp {

    public static void main(String[] args) {
        int[] grades = {4, 8, 10, 3, 6, 2, 1, 4};
        int maxPosition = 0;

        maxPosition = getMaxPosition(grades, 0, grades.length - 1);
        System.out.printf("Max value: %d, Max position: %d", grades[maxPosition], maxPosition + 1);
    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPosition = low;
        int maxValue;

        if ((low < 0) || (high > arr.length - 1)) {
            return -1;
        }

        maxValue = arr [low];
        for (int i = low; i <= high; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }

        return maxPosition;
    }
}
