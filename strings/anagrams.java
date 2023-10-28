package strings;

import java.util.Arrays;

public class anagrams {
    public static void main(String arg[]) {
        String str1 = "heart";
        String str2 = "earth";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        boolean result = Arrays.equals(c1, c2);
        if (result) {
            System.out.println("they are anagram");
        } else {
            System.out.println("they are not anagram");
        }
    }
}