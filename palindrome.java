
import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static int scoreString(String str) {
        int score = 0;
        int n = str.length();
        for (int length : new int[] { 4, 5 }) {
            for (int start = 0; start < n - length + 1; start++) {
                String substring = str.substring(start, start + length);
                if (isPalindrome(substring)) {
                    if (length == 4) {
                        score += 5;
                    } else if (length == 5) {
                        score += 10;
                    }
                }
            }
        }
        return score;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int result = scoreString(str);
        System.out.println(result);
    }
}
