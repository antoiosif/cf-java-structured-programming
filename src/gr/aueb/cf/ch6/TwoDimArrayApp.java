package gr.aueb.cf.ch6;

/**
 * Defines a 2D array and populates it.
 * 2D arrays are defined as [rowCount][colCount].
 */
public class TwoDimArrayApp {

    public static void main(String[] args) {
        int[][] arr1 = new int[2][2];

        arr1[0][0] = 0;     // 1η γραμμή, 1η στήλη
        arr1[0][1] = 1;     // 1η γραμμή, 2η στήλη
        arr1[1][0] = 2;     // 2η γραμμή, 1η στήλη
        arr1[1][1] = 3;     // 2η γραμμή, 2η στήλη

        System.out.println("Arr1:");
        traverse(arr1);

        // Unsized Initialization
        int[][] arr2 = {{1, 2}, {3, 4}, {5, 6}};

        System.out.println("Arr2:");
        traverse(arr2);

        // Array Initializer
        int[][] arr3 = new int[][] {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Arr3:");
        traverse(arr3);
    }

    public static void traverse(int[][] arr) {
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

}
