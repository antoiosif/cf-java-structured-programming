package gr.aueb.cf.ch6;

/**
 * Searches for an array element and returns
 * the position if it is found, -1 otherwise.
 */
public class ArraySearchApp2 {

    public static void main(String[] args) {
        final int EXCELLENT_GRADE = 10;
        int[] grades = {6, 3, 8, 9, 1, 10};
        int position = -1;  // αρχικοποιούμε σε μία μη έγκυρη τιμή

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == EXCELLENT_GRADE) {
                position = i;
                break;
            }
        }

        if (position == -1) {
            System.out.println("NOT FOUND");
        } else {
            System.out.printf("The element %d was found at position %d.", grades[position], position + 1);
        }
    }
}