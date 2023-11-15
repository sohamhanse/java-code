package Heaps_priority_queue;

import java.util.PriorityQueue;

public class connect_n_rope_with_min_cost {
    public static void main(String arg[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(4);
        pq.add(3);
        pq.add(2);
        pq.add(6);
        int cost = 0;
        
        while (pq.size() > 1) {
                int sum = pq.remove() + pq.remove();
                pq.add(sum);
                cost = cost + sum;
        }
        
        System.out.println(cost);
    }
    
}
