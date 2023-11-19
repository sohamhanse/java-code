package Heaps_priority_queue;
import java.util.*;
public class Minimum_Operations_to_Halve_Array_Sum {
    public static int count(int arr[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int sum = 0;
        for(int i = 0 ; i< arr.length ; i++){
            pq.add(arr[i]);
            sum+=arr[i];
        }
        int count = 0;
        int temp = sum;
        while(temp > sum/2 ){
            count++;
            int curr = pq.remove()/2;
            temp -= curr;
            pq.add(curr);
        }
        return count;
    }

    public static void main(String arg[]){
        int arr[] = {1, 5, 8, 19};
        System.out.println(count(arr));
    }
}
