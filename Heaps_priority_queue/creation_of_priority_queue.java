package Heaps_priority_queue;
import java.util.*;
public class creation_of_priority_queue {
    public static void main(String arg[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(2);
        pq.add(3);
        pq.add(6);

        while(! pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
