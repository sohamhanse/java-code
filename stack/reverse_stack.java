package stack;

import java.util.*;

public class reverse_stack {
    public static void bottom(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        bottom(data, s);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s ){
        if(s.isEmpty()){
            return;
        }
          int top = s.pop();
          reverse(s);
          bottom(top, s);  
    }
    public static void print(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void main(String arg[]){
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        // print(s);
        System.out.println(s.get(2));
        reverse(s);
        System.out.println();
        print(s);
    }
}
