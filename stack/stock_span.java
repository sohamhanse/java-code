package stack;

import java.util.Stack;

public class stock_span {
    public static void main(String arg[]){
        int stock[] ={100,80,60,70,60,84,100};
        int spam [] = new int[stock.length];
        Stack<Integer> s = new Stack<>();
        spam[0] = 1;
        s.push(0);
        for(int i = 1 ; i<stock.length ; i++){
            int current = stock[i];
            while(!s.isEmpty() && current >= stock[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                spam[i] = i+1;
            }else{
                spam[i] = i-s.peek();
            }
            s.push(i);
        }

        for(int i = 0 ; i<spam.length;i++){
            System.out.println(spam[i]);
        }
    }
}
