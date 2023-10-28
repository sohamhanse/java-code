package queue;

import java.util.Deque;
import java.util.LinkedList;

public class stack_using_deque {
    static class stack{
        static Deque<Integer> d = new LinkedList<Integer>();
        
        public  void add(int data){
            d.addLast(data);
        }
        public  int remove(){
            if(d.isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            int i = d.getLast();
            d.removeLast();
            return i;
        }

        public  int peek(){
             if(d.isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            return d.getLast();
        }

        public  boolean isEmpty(){
            return d.isEmpty();
        }

    }

    public static void main(String arg[]){
        stack s  = new stack();
        s.add(1);
        s.add(2);
        s.add(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.remove();
        }
    }
}
