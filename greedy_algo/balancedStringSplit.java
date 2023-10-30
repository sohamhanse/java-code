package greedy_algo;

import java.util.Stack;

public class balancedStringSplit {
        public static int Split(String s) {
            Stack<Character> st = new Stack<>();
            int count = 0;
    
            for (char c : s.toCharArray()) {  // s.toCharArray : - convert String into charecter like "hello" = ['h','e','l','l','o']
                if (st.isEmpty()) {
                    st.push(c);
                } else {
                    if (c == st.peek()) {
                        st.push(c);
                    } else {
                        st.pop();
                        if (st.isEmpty()) {
                            count++;
                        }
                    }
                }
            }
    
            return count;
        }
    public static void main(String arg[]){
        String s = "RLRRLLRLRL";
        System.out.println(Split(s));
    }
}
