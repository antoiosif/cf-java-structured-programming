package gr.aueb.cf.ch6;

/**
 * Ελέγχει αν ένας πίνακας έχει άθροισμα 15
 * σε όλες τις πλευρές του και τις διαγωνίους.
 */
public class Array15App {

    public static void main(String[] args) {
        int[][] arr = {{2, 7, 6},
                       {9, 5, 1},
                       {4, 3, 8}
        };

        System.out.printf("it is%s arr15\n", (isArr15(arr) ? "" : " not"));
    }

    public static boolean isArr15(int[][] arr) {
        int hCount = 0;
        int vCount = 0;
        int diagonal1Sum = 0;
        int diagonal2Sum = 0;
        int[] vSum = new int[3];
        int[] hSum = new int[3];
        boolean isDiagonal1 = false;
        boolean isDiagonal2 = false;

        if (arr == null) throw new RuntimeException();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                hSum[i] += arr[i][j];
            }

            diagonal1Sum += arr[i][i];
            diagonal2Sum += arr[i][arr.length - i - 1];

            vSum[0] += arr[i][0];
            vSum[1] += arr[i][1];
            vSum[2] += arr[i][2];
        }

        for (int num : hSum) {
            if (num == 15) hCount++;
        }

        for (int num : vSum) {
            if (num == 15) vCount++;
        }

        if (diagonal1Sum == 15) isDiagonal1 = true;
        if (diagonal2Sum == 15) isDiagonal2 = true;

        return (isDiagonal1 && isDiagonal2 && (hCount == 3) && (vCount == 3));

//        // Η δική μου λύση
//        int hSum = 0;
//        int vSum = 0;
//        int diagonal1Sum = 0;
//        int diagonal2Sum = 0;
//
//        if (arr == null) throw new RuntimeException();
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                hSum += arr[i][j];
//                vSum += arr[j][i];
//            }
//            if ((hSum != 15) || (vSum != 15)) return false;
//            diagonal1Sum += arr[i][i];
//            diagonal2Sum += arr[i][arr.length - 1 - i];
//            hSum = 0;
//            vSum = 0;
//        }
//        return (diagonal1Sum == 15) && (diagonal2Sum == 15);
    }
}
