package Heaps_priority_queue;

import java.util.*;

public class heap_using_arraylist {
    static class heap{
         ArrayList<Integer> a =  new ArrayList<>();
        public void add(int i){
            a.add(i);
            int chad = a.size() - 1;
            int par = (chad - 1) /2;

            while(a.get(chad) < a.get(par)){
                int temp = a.get(chad);
                a.set(chad , a.get(par));
                a.set(par , temp);
                chad = par;
                par = (chad - 1) /2;
            }
      }

      private void heapify(int i){
        int left =  (2*i+1);
        int right = (2*i +2);
        int min = i;
        if(left < a.size() && a.get(left) < a.get(min)){
            min = left;
        }
        if(right < a.size() && a.get(right) < a.get(min)){
            min = right;
        }
        if(min != i){
            int temp = a.get(i);
            a.set(i, a.get(min));
            a.set(min, temp);

            heapify(min);
        }


      }
      public int  remove(){
        int data  = a.get(0);
        int temp = a.get(a.size()-1);
        a.set(a.size()-1, a.get(0));
        a.set(0, temp);
        
        a.remove(a.size()-1);

        heapify(0);
        return data;
      }

      public int peek(){
        return a.get(0);
      }
      public boolean isEmpty(){
        return a.size() == 0;
      }
    }

    public static void main(String arg[]){
       heap p = new heap();
        p.add(2);
        p.add(4);
        p.add(3);
        p.add(5);
        p.add(10);
        p.add(1);

           while(!p.isEmpty()){
            System.out.print(p.peek()+" ");
            p.remove();
           }
    }
}
