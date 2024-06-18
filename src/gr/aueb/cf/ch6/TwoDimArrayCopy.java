package gr.aueb.cf.ch6;

import java.util.Arrays;

public class TwoDimArrayCopy {

    public static void main(String[] args) {
        int[][] grid = {{1, 2, 3}, {4, 5, 6}};

//        int[][] gridCopyRef = copyReference(grid);
//        gridCopyRef[0][0] = 100;
//        traverse(grid);

//        int[][] gridShallowCopy = shallowCopy(grid);
//        gridShallowCopy[0][0] = 200;
//        traverse(grid);

        int[][] gridDeepCopy = deepCopy(grid);
        gridDeepCopy[0][0] = 300;
        traverse(grid);
    }

    /**
     * Returns (shallow copy) the reference of the
     * two-dim array.
     *
     * @param arr   the input two-dim array.
     * @return      a reference, which essentially is
     *              a shallow copy.
     */
    public static int[][] copyReference(int[][] arr) {
        return arr;
    }

    public static int[][] shallowCopy(int[][] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    public static int[][] deepCopy(int[][] arr) {
        int[][] returnedArray = new int[arr.length][];

        for (int i = 0; i < arr.length; i++) {
            returnedArray[i] = new int [arr[i].length];
//            for (int j = 0; j < arr[i].length; j++) {
//                returnedArray[i][j] = arr[i][j];
//            }
            returnedArray[i] = Arrays.copyOf(arr[i], arr[i].length);
        }

        return returnedArray;
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

