package gr.aueb.cf.ch10;

import java.util.ArrayList;
import java.util.List;

public class MinTimeToPassTheRiver {

    public static void main(String[] args) {
        int[] t = {1, 1, 2, 2, 4, 3, 1};
        System.out.println(getMinTime(4, t));
    }

    public static int getMinTime(int y, int[] arr) {
        int[] helperArray = new int[y+1];
        int remainingSteps = y;
        int time = -1;

        for (int i = 0; i < arr.length; i++) {
            //If the leave has not set (0), set it (1) at the
            // helper array. The index of helper array is the
            // position where the leave falls.
            if (helperArray[arr[i]] == 0) {
                helperArray[arr[i]] = 1;
                remainingSteps--;
            } else continue;
            if (remainingSteps == 0) {
                time = i;
                break;
            }
        }

        return time;
    }
}
