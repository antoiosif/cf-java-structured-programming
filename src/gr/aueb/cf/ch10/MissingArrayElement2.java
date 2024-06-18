package gr.aueb.cf.ch10;

public class MissingArrayElement2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Missing num: " + getMissingElement(arr));
    }

    public static int getMissingElement(int[] arr) {
        int num = 0;

        for (int i = 1; i < arr.length; i++) {
            num = arr[i-1] + 1;
            if (arr[i] != num) break;
        }
        return num;
    }
}
