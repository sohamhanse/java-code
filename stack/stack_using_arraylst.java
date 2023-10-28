package stack;
import java.util.*;
public class stack_using_arraylst{
        static class stack{
         ArrayList <Integer> list = new ArrayList<>();

        public void push(int data){
            list.add(data);
        }
        public boolean isEmpty(){
            return list.size() == 0;
        }
        public int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public int peek(){
            return list.get(list.size()-1);
        }
    }

    
    public static void main(String arg[]){
        stack s  =new stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}