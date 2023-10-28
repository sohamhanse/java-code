package pattern;
import java.util.*;

public class inverted_half_pyramid_with_num {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int num = 1; num <= n - i; num++) {
                System.out.print(num);
            }
            System.out.println();
        }
        sc.close();
    }
}