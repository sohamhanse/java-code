package stack;

import java.util.*;

public class dublicate_paranthesis {
    public static boolean valid(String paranthesis) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < paranthesis.length(); i++) {
            if (paranthesis.charAt(i) == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if ( count < 1) {
                    return true;   // if dublicate present
                } else {
                    return false;  //
                }
            } else {
                s.push(paranthesis.charAt(i));
            }
        }

        return false;
    }

    public static void main(String arg[]) {
        String str = "(a+b)";
        System.out.println(valid(str));
    }
}
