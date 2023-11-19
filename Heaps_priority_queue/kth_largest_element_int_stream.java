package Heaps_priority_queue;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class kth_largest_element_int_stream {
    public static void main(String arg[]) {
        int arr[] = {10, 20, 11, 70, 50, 40, 100, 5};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        int k = 3;
        ArrayList<Integer> a = new ArrayList<>();

        while (i < arr.length) {
            if (pq.size() < k) {
                pq.add(arr[i]);
            } else { 
                if (pq.peek() < arr[i]) {
                    pq.remove();
                    pq.add(arr[i]);
                } else {
                    pq.add(arr[i]);
                }
            }

            if (pq.size() < k) {
                a.add(null);
            } else {
                a.add(pq.peek());
            }

            i++;
        } 

        for (int j = 0; j < a.size(); j++) {
            System.err.print(a.get(j) + " ");
        }
    }
}
