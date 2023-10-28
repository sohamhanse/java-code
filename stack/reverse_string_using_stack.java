package stack;

import java.util.Stack;

public class reverse_string_using_stack {
    public static String reverse(String str){

        Stack<Character> s = new Stack<>();
        int index = 0;
        while(index < str.length()){
           s.push(str.charAt(index));
           index++; 
        }
        StringBuilder str1 = new StringBuilder("");
        while(!s.isEmpty()){
            str1.append(s.pop());
        }
        str = str1.toString();

        return str;
    }

    public static void main(String arg[]){
        String str = "abc";
        System.out.println(reverse(str));
    }
}
