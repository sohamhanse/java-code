package queue;
import java.util.*;
public class queue_using_deque {
    static class queue{
        static Deque<Integer> d = new LinkedList<Integer>();
        
        public  void add(int data){
            d.addLast(data);
        }

        public  int remove(){
            if(d.isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            int i = d.getFirst();
            d.removeFirst();
            return i;
        }

        public  int peek(){
             if(d.isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            return d.getFirst();
        }

        public  boolean isEmpty(){
            return d.isEmpty();
        }

    }

    public static void main(String arg[]){
        queue q  = new queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
