package Heaps_priority_queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class sliding_window_maximum {
    public static void main(String arg[]){
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3; // window size
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int i = 0;

        // Initialize the PriorityQueue with the first k elements
        while (i < k) {
            pq.add(arr[i]);
            i++;
        }

        ArrayList<Integer> result = new ArrayList<>();
        while (i < arr.length) {
            result.add(pq.peek()); // Get the maximum element in the current window
            pq.remove(arr[i - k]); // Remove the first element of the window     pq.remove(arr[i - k]) -> this will remove specific element which present at arr[i - k]
            pq.add(arr[i]); // Add the next element to the window
            i++;
        }

        result.add(pq.peek()); // Add the maximum element of the last window

        // Print the result
        for (Integer num : result) {
            System.out.print(num + " ");
        }
    }
}
