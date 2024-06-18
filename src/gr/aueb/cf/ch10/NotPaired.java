package gr.aueb.cf.ch10;

public class NotPaired {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        int result = 0;

        for (int num : arr) {
            // Το XOR ακυρώνει τα ζεύγη όμοιων αριθμών
            result = result ^ num;
        }
        System.out.println("Result: " + result);
    }
}
