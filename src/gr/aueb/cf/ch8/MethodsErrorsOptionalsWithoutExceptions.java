package gr.aueb.cf.ch8;

import javax.xml.transform.sax.SAXResult;
import java.util.Arrays;
import java.util.Optional;

public class MethodsErrorsOptionalsWithoutExceptions {

    public static void main(String[] args) {
        String s = "Athens";
        Optional<String> opt = getStringCopy(s);
        opt.ifPresent(System.out::println);
    }

    /**
     * It echoes the given string back to the caller.
     * Since strings are immutable we can just get
     * the reference back.
     *
     * @param s     the source string.
     * @return      te source string as an Optional object.
     */
    public static Optional<String> getStringCopy(String s) {
        return Optional.ofNullable(s);
    }

    /**
     * Returns the position in an array of a
     * num.
     *
     * @param arr       the input array.
     * @param num       the input num.
     * @return          the position of the array, if the num
     *                  was found, -1 otherwise.
     */
    public static int findNumPositionInArray(int[] arr, int num) {
        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                positionToReturn = i;
                break;
            }
        }

        return positionToReturn;
    }

    /**
     * Returns a string that starts with a specific prefix.
     *
     * @param arr       the input array of strings.
     * @param str       the input prefix.
     * @return          the string in the array that matches the
     *                  input prefix, null otherwise.
     */
    public static Optional<String> getStringStartsWith(String[] arr, String str) {
        if (arr == null || str == null) return Optional.empty();

        Optional<String> token = Optional.empty();

        for (String s : arr) {
            if (s.startsWith(str)) {
                token = Optional.of(str);
                break;
            }
        }
        return token;
    }

    /**
     * Returns a copy of a given array of ints.
     * Instead of null, it returns Optional.
     * Since the array is mutable we return not
     * just a reference but a copy of the array.
     *
     * @param arr   the source array.
     * @return      an Optional, null or empty.
     */
    public static Optional<int[]> getCopy(int[] arr) {
        if (arr == null) return Optional.empty();
        return Optional.of(Arrays.copyOf(arr, arr.length));
    }
}
