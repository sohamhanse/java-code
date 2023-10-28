package stack;
import java.util.*;
public class next_greater {
    public static int[] greater(int value[]){
        int next [] = new int[value.length];
        Stack<Integer> s = new Stack<>();
        for(int i = value.length-1 ; i>=0 ; i--){
            while(!s.isEmpty() && value[s.peek()]<=value[i]){
                s.pop();
            }
            if(s.isEmpty()){
                next[i] = -1;
               
            }else{
                next[i] = value[s.peek()];
            }
             s.push(i);
        }
        return next;
        
    }
    public static void main(String arg[]){
        int value[] = {6,8,0,1,3};
        greater(value);
        int next[] = greater(value);
        for(int i = 0 ; i<next.length ;i++){
            System.out.print(next[i]+" ");
        }

        // from this code we can able to find 
        // next greater for right :- for(int i = value.length-1 ; i>=0 ; i--) & while(!s.isEmpty() && value[s.peek()]<=value[i])
        // next greater for left  :- for(int i =0; i < value.length ; i++ )   & while(!s.isEmpty() && value[s.peek()]<=value[i])
        // next smaller for right :- for(int i = value.length-1 ; i>=0 ; i--) & while(!s.isEmpty() && value[s.peek()]>=value[i])
        // next smaller for left  :- for(int i =0; i < value.length ; i++ )   & while(!s.isEmpty() && value[s.peek()]>=value[i])
    }
}
