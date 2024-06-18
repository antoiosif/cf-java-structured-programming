package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Demo of binary search algorithm that is based
 * in sorted arrays and gives Time Complexity O(log(n)).
 */
public class BinarySearchApp {

    public static void main(String[] args) {
        int[] arr = {1, 6, 9, 23, 25, 68, 77, 90};
        int value = 68;
        int low = 0;
        int high = arr.length - 1;
        int position = -1;

//        position = Arrays.binarySearch(arr, value);       // έτοιμη μέθοδος της κλάσης Arrays
        position = binarySearch(arr, value, low, high);
        if (position < 0) {
            System.out.println("Value was not found");
        } else {
            System.out.println("Value was found in position " + (position + 1));
        }
    }

    /**
     * Returns the position in a sorted array of
     * a certain value.
     *
     * @param arr       the sorted array.
     * @param value     the searched value.
     * @param low       the start index.
     * @param high      the end index.
     * @return          the position if the value is found, -1 otherwise.
     */
    public static int binarySearch(int[] arr, int value, int low, int high) {
        int mid = 0;

        if (arr == null) return -1;
        if ((low < 0) || (high > arr.length - 1)) return -1;
        if (low > high) return -1;

        mid = (low + high) / 2;
        if (arr[mid] == value) return mid;
        if (arr[mid] < value) {
            return binarySearch(arr, value, mid + 1, high);
        } else {
            return binarySearch(arr, value, low, mid - 1);
        }
    }
}