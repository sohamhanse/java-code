import java.util.*;

class Solution {
    public int balancedStringSplit(String s) {
        Stack<Character> st = new Stack<>();
        int i = 1;
        int count = 0;
        st.push(s.charAt(0));
        while (i < s.length()) {
            if (st.isEmpty()) {
                count++;
            }
            if (s.charAt(i) == 'R') {
                st.push(s.charAt(i));
            }
            if (s.charAt(i) == 'L') {
                st.pop();

            }
            i++;
        }
        return count;
    }
}