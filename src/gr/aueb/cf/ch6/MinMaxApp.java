package gr.aueb.cf.ch6;

/**
 * Finds the min/max element position and the
 * corresponding element value in an array of ints.
 */
public class MinMaxApp {

    public static void main(String[] args) {
        int[] grades = new int[] {7, 6, 3, 9, 10, 4, 6, 6, 7};
        int minPosition = 0;
        int maxPosition = 0;
        int minValue = grades[0];
        int maxValue = grades[0];

        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < minValue) {
                minPosition = i;
                minValue = grades[i];
            }
            if (grades[i] > maxValue) {
                maxPosition = i;
                maxValue = grades[i];
            }
        }

        System.out.printf("MinValue: %d, MinPosition: %d\nMaxValue: %d, MaxPosition: %d",
                minValue, minPosition + 1, maxValue, maxPosition + 1);
    }
}
