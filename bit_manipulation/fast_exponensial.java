package bit_manipulation;

import java.util.*;

public class fast_exponensial {
    public static int fast_expo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :- ");
        int a = sc.nextInt();
        System.out.print("enter raise to :- ");
        int n = sc.nextInt();
        System.out.println(fast_expo(a, n));
        sc.close();
    }
}
