package gr.aueb.cf.ch6;

import static java.util.Arrays.sort;

/**
 * Sorts an array with selection sort.
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 9, 4, 1, 2};

        sort(arr);
        selectionSort(arr);
        traverseArray(arr);
    }

    /**
     * Sorting based on Selection sort.
     * Time-complexity: O(n^2)
     *
     * @param arr   the input array
     */
    public static void selectionSort(int[] arr) {
        int minPosition;
        int min;

        if (arr == null) return;

        for (int i = 0; i < arr.length - 1; i++) {
            minPosition = i;
            min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    minPosition = j;
                    min = arr[j];
                }
            }
            swap(arr, i, minPosition);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        if (arr == null) return;

        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void traverseArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}

