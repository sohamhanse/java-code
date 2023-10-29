package greedy_algo;

import java.util.Arrays;
import java.util.Comparator;

public class job_sequence {
    public static void main(String arg[]) {
        int pair[][] = { { 4, 20 }, { 3, 10 }, { 1, 40 }, { 2, 30 }};
        Arrays.sort(pair, Comparator.comparingDouble(o -> o[1]));
        int ed = 0;
        int amount = 0;
        for (int i = pair.length-1 ; i >=0 ; i--) {
            if (pair[i][0] > ed) {
                amount += pair[i][1];
                ed++;
            }
        }
        System.out.println(amount);
    }
}
