package queue;
import java.util.*;
public class reverse_first_k_element {
    public static void reverse(Queue<Integer> q , int k){
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < k; i++) {
            s.push(q.remove());
        }        
        while(!s.isEmpty()){
            q.add(s.pop());
        }
         for(int i = 0 ; i< q.size() - k ;i++){
             q.add(q.remove());
       }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);
    
        int k = 5;
    
        reverse(queue, k);
    
        // Print the reversed first 'k' elements
        while (!queue.isEmpty()) {
            System.out.print(queue.peek() + " ");
            queue.remove();
        }
    }
    
}
