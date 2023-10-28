package stack;
import java.util.*;
public class valid_paranthesis {
    public static boolean valid(String paranthesis){
        Stack<Character> s = new Stack<>();
        for(int i = 0 ; i< paranthesis.length() ;i++){
            if(paranthesis.charAt(i) == '{' || paranthesis.charAt(i) == '[' || paranthesis.charAt(i) == '('){
                s.push(paranthesis.charAt(i));
            }else{
                if(s.peek()=='[' && paranthesis.charAt(i)==']' || s.peek()=='{' && paranthesis.charAt(i)=='}' || s.peek()=='(' && paranthesis.charAt(i)==')'   ){
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        if(!s.isEmpty()){
            return false;
        }
        return true;
    }
    public static void main(String arg[]){
        String str = "{[()]]}";
        System.out.println(valid(str ));
    }
}
