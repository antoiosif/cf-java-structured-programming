package gr.aueb.cf.ch6;

/**
 * Predicates are boolean methods.
 */
public class PredicatesApp {

    public static void main(String[] args) {
        int[] arr = {-10, 5, 6, 7, 8, 9, 17, 9};

        System.out.println("Has at least one positive: " + hasOnePositive(arr));
        System.out.println("Are all positive: " + areAllPositive(arr));
        System.out.println("Has less than 3 positive: " + areLTNPositive(arr, 3));
        System.out.println("Has more than 3 even: " + areGTEven(arr, 3));
        System.out.println("Has more than 4 odd: " + areGTOdd(arr, 2));
        System.out.println("Has at least 2 with the same ending: " + areSameEnding(arr, 2));
        System.out.println("Has at least 2 in the same group of ten: " + areSameGroupOfTen(arr, 2));
        System.out.println("Has more than 2 evens: " + moreThanTwoEvens(arr));
        System.out.println("Has more than 2 odds: " + moreThanTwoOdds(arr));
        System.out.println("Has more than 2 consecutive: " + moreThanTwoConsecutive(arr));
    }

    /**
     * Checks if there is at least one positive
     * in the input array.
     *
     * @param arr   the input array.
     * @return      true, if there is at least one positive,
     *              false otherwise.
     */
    public static boolean hasOnePositive(int[] arr) {
        boolean hasPositive = false;

        for (int item : arr) {
            if (item > 0) {
                hasPositive = true;
                break;
            }
        }
        return hasPositive;
    }

    public static boolean areAllPositive(int[] arr) {
        int count = 0;

        for (int item : arr) {
            if (item > 0) {
                count++;
            }
        }
        return count == arr.length;
    }

    public static boolean areLTNPositive(int[] arr, int threshold) {
        int count = 0;

        for (int item : arr) {
            if (item > 0) {
                count++;
            }
        }
        return count <= threshold;
    }

    public static boolean areGTEven(int[] arr, int threshold) {
        int count = 0;

        for (int item : arr) {
            if (item % 2 == 0) {
                count++;
            }
        }
        return count >= threshold;
    }

    public static boolean areGTOdd(int[] arr, int threshold) {
        int count = 0;

        for (int item : arr) {
            if (item % 2 != 0) {
                count++;
            }
        }
        return count >= threshold;
    }

    public static boolean areSameEnding(int[] arr, int threshold) {
        int[] endings = new int[10];
        boolean sameEnding = false;

        for (int item : arr) {
            endings[item % 10]++;
        }

        for (int item : endings) {
            if (item >= threshold) {
                sameEnding = true;
                break;
            }
        }

        return sameEnding;
    }

    public static boolean areSameGroupOfTen(int[] arr, int threshold) {
        int[] tens = new int[10];
        boolean sameTen = false;

        for (int item : arr) {
            if (item == 100) {
                tens[9]++;
            } else {
                tens[item / 10]++;
            }
        }

        for (int item : tens) {
            if (item >= threshold) {
                sameTen = true;
                break;
            }
        }

        return sameTen;
    }

    /**
     * Traverses an array to decide if the array
     * involves more than two even numbers.
     *
     * @param arr   the source array.
     * @return      true, if the array contains
     *              more than two evens, false otherwise.
     */
    public static boolean moreThanTwoEvens(int[] arr) {
        if (arr == null || arr.length < 3) return false;
        int evens = 0;
        for (int item : arr) {
            if (item % 2 == 0) {
                evens++;
            }
        }
        return evens > 2;
    }

    /**
     * Traverses an array to decide if the array
     * involves more than two odd numbers.
     *
     * @param arr   the source array.
     * @return      true, if the array contains
     *              more than two odds, false otherwise.
     */
    public static boolean moreThanTwoOdds(int[] arr) {
        if (arr == null || arr.length < 3) return false;
        int odds = 0;
        for (int item : arr) {
            if (item % 2 != 0) {
                odds++;
            }
        }
        return odds > 2;
    }

    /**
     * Traverses an array to decide if the array
     * involves more than two consecutive numbers.
     *
     * @param arr   the source array.
     * @return      true, if the array contains
     *              more than two consecutive, false otherwise.
     */
    public static boolean moreThanTwoConsecutive(int[] arr) {
        if (arr == null || arr.length < 3) return false;
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            if ((arr[i] == arr[i+1] - 1) && (arr[i] == arr[i+2] - 2)) {
                count++;
            }
        }
        return count >= 1;
    }
}
