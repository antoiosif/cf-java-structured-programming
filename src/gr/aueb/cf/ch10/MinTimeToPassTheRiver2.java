package gr.aueb.cf.ch10;

import java.util.ArrayList;
import java.util.List;

public class MinTimeToPassTheRiver2 {

    public static void main(String[] args) {
        int y = 4;
        int[] t = {1, 1, 2, 2, 4, 3, 1};
        int minTime = 0;

        minTime = getMinTime(t, y);
        if (minTime == -1) System.out.println("The frog cannot pass the river");
        System.out.printf("The frog can pass the river in %d seconds.", minTime);
    }

    public static int getMinTime(int[] arr, int y) {
        List<Integer> helpArray = new ArrayList<>();
        int time = -1;

        for (int i = 0; i < arr.length; i++) {
            if (helpArray.contains(arr[i])) continue;
            helpArray.add(arr[i]);
            if (helpArray.size() == y) {
                time = i;
                break;
            }
        }

        return time;
    }
}
