package queue;

import java.util.*;

public class First_Non_Repeating_Element {
    public static String remove(String str) {
        StringBuilder sb = new StringBuilder("");
        Queue<Character> q = new LinkedList<>();
        int arr[] = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Increment the count of the character in the array
            arr[c - 'a']++;
            q.add(c);

            // Check if the current character is non-repeating
            while (!q.isEmpty() && arr[q.peek() - 'a'] > 1) {
                q.remove();
            }

            // If all characters so far have duplicates, append -1
            if (q.isEmpty()) {
                sb.append(-1);
            } else {
                sb.append(q.peek());
            }
        }

        String result = sb.toString();
        return result;
    }

    public static void main(String arg[]) {
        String str = "aabccxb";
        System.out.println(remove(str));
    }
}
