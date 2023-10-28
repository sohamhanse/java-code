
package array;

public class kadanes_algo {
    public static void main(String arg[]) {
        int arr[] = { 1,-1,3,-4,5};
        int curr_sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            curr_sum += arr[i];
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max = Math.max(curr_sum, max);
        }
        System.out.println(max);
    }

}