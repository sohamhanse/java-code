package queue;
import java.util.*;
public class conn_n_ropes_with_minimum_cost {
    public static long min(int arr[]){
        PriorityQueue<Long> pq = new PriorityQueue<Long>();
        for (int i = 0; i < arr.length; i++) {
            pq.add((long) arr[i]); // Cast arr[i] to long
        }
        
        long res = 0; // Change the result variable type to long
        while (pq.size() > 1) {
            long first = pq.poll();
            long second = pq.poll();
            res = res + (first + second);
            pq.add(first + second);
        }
        return res;
        
    }

    public static void main(String arg[]){
        int arr[] = {4,6,2,3};
        System.out.println(min(arr));
    }


}
