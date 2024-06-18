package gr.aueb.cf.ch6;

/**
 * Ελέγχει αν ένας πίνακας ακεραίων είναι συμμετρικός
 * δηλαδή διαβάζεται το ίδιο από την αρχή και το τέλος.
 */
public class SymmetricArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 1};

        System.out.println("Array is symmetric: " + isArraySymmetric(arr));
        System.out.println("Array is symmetric: " + isArraySymmetric2(arr));
    }

    /**
     * Decides if an array is symmetric. The algorithm uses
     * a special form of for iteration with two indexes i, j.
     *
     * @param arr   the source array.
     * @return      true if array is symmetric, false otherwise.
     */
    public static boolean isArraySymmetric(int[] arr) {
        boolean isSymmetric = true;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                isSymmetric = false;
                break;
            }
        }

        return isSymmetric;
    }

    /**
     * Decides if an array is symmetric. The algorithm
     * considers an iterative procedure, that is, a for
     * loop that runs n / 2 times, where n = arr.length-1.
     *
     * @param arr   the source array.
     * @return      true if array is symmetric, false otherwise.
     */
    public static boolean isArraySymmetric2(int[] arr) {
        boolean isSymmetric = true;
        int n = arr.length - 1;

        for (int i = 0; i <= n / 2; i++) {
            if (arr[i] != arr[n - i]) {
                isSymmetric = false;
                break;
            }
        }

        return isSymmetric;
    }
}
