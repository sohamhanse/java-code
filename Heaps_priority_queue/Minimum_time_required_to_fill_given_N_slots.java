package Heaps_priority_queue;

import java.util.*;

public class Minimum_time_required_to_fill_given_N_slots {
    public static void main(String arg[]){
        int arr[] = {2,6};
        int n = 6;
        Queue<Integer> q = new LinkedList<>();
        int val[] = new int[n+1];
        for(int i = 0 ; i<arr.length ; i++){
            q.add(arr[i]);
            val[arr[i]]++;
        }
        int count = 0;
        if(q.size() != n){
            while(q.size() > 0){
            for(int i = 0 ; i< q.size() ; i++){
                int curr = q.poll();
                if(curr -1 >= 1 && val[curr-1] == 1){
                    val[i] = 1;
                    q.add(val[i]);
                }
                if(curr+1 <= n && val[curr+1] == 1){
                    val[i] = 1;
                    q.add(val[i]);
                }
            }
            count++;
        }
        }
        System.out.println(count);
    }
}
