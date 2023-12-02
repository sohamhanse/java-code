package hashmap;

import java.util.HashMap;

public class two_sum {
    public static void main(String arg[]) {
        HashMap<Integer, Integer> h = new HashMap<>();
        h.put(0, 0);
        int arr[] = { 2, 7, 11, -2 };
        int target = 9;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (h.containsKey(sum - target)) {
                System.out.println("[" + h.get(sum - target) + "," + i + "]");
            }
            h.put(sum, i + 1);
        }

    }
}
