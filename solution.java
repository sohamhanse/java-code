import  java.util.*;
class Solution {
    static boolean e = false;
    public static void stack(Stack<Integer> s1 , Stack<Integer>s2) {
       if(s1.isEmpty()){
        e = true;
        return;
       }
       if(s1.peek() != s2.peek()){
        return ;
       }
       int t1 = s1.peek();
       int t2 = s2.peek();
       s1.pop();
       s2.pop();
       stack(s1, s2);
       s1.push(t1);
       s2.push(t2);
    }
     public static void main(String arg[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        Stack<Integer> s2 = new Stack<>();
        s2.push(1);
        s2.push(2);
        s2.push(3);
        
        stack(s, s2);
        System.out.println(e);
        
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

        while(!s2.isEmpty()){
            System.out.println(s2.peek());
            s2.pop();
        }
    }
}
