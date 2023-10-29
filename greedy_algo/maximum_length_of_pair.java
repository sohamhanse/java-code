package greedy_algo;

import java.util.Arrays;
import java.util.Comparator;

public class maximum_length_of_pair {
    public static void main(String arg[]) {
        int pair[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        Arrays.sort(pair, Comparator.comparingDouble(o -> o[1]));
        int ed = pair[0][1];
        int count = 1;
        for (int i = 1; i < pair.length; i++) {
            if (pair[i][0] >= ed) {
                count++;
                ed = pair[i][1];
            }
        }
        System.out.println(count);
    }
}
