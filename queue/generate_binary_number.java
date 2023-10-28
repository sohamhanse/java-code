package queue;

import java.util.*;
public class generate_binary_number {
    public static void main(String arg[]){

        //using stack 

        // Stack<Integer> s = new Stack<>();
        // int num = 8;
        // for(int i = 1 ; i<=num ; i++){
        //     int n = i;
        //     while(n != 0){
        //         s.push(n%2);
        //         n = n/2;
        //     }
        //     while(!s.isEmpty()){
        //         System.out.print(s.pop());
        //     }
        //     System.out.print(" ");
        // }

        //using queue
        Queue<String> q = new LinkedList<>();
        int n = 5;
        q.add("1");
        while(n-- > 0){
            String s1 = q.peek();
            q.remove();
            System.out.println(s1);
            q.add(s1+"0");
            q.add(s1+"1");
        }
    }
}
