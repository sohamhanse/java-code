package queue;
import java.util.*;
public class reversal {
    public static void reverse(Queue<Integer> q){
        Stack<Integer> s  =new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String arg[]){
        Queue<Integer> o = new LinkedList<>();
        o.add(1);
        o.add(2);
        o.add(3);
        o.add(4);
        o.add(5);
        o.add(6);
        o.add(7);
        o.add(8);
        reverse(o);
        while(!o.isEmpty()){
            System.out.println(o.remove());
        }
    }
}
