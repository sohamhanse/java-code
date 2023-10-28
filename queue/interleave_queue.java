package queue;
import java.util.*;
public class interleave_queue {
    public static void  interleave(Queue<Integer> o){
        Queue<Integer> n = new LinkedList<>();
        int size  = o.size();
        int i = 0;
        while(i!=(size/2)){
            n.add(o.remove());
            i++;
        }
        while(!n.isEmpty()){
            o.add(n.remove());
            o.add(o.remove());
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
        interleave(o);
        while(!o.isEmpty()){
            System.out.println(o.remove());
        }
    }
}
