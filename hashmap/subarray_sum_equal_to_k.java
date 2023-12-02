package hashmap;

import java.util.HashMap;

public class subarray_sum_equal_to_k {
    public static int getcount(int arr[], int k) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int high = 0;
        int sum = 0;
        h.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (h.containsKey(sum - k)) {
                high += h.get(sum - k);
            }
            h.put(sum, h.getOrDefault(sum, 0) + 1);
        }

        return high;
    }

    public static void main(String arg[]) {
        int arr[] = { 10, 2, -2, -20, 10 };
        System.out.println(getcount(arr, -10));
    }
}
