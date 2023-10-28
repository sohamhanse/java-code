package pattern;
import java.util.*;

public class butterfly_pattern {
    public static void butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int st = 1; st <= i; st++) {
                System.out.print("*");
            }
            for (int sp = 1; sp <= (n - i) * 2; sp++) {
                System.out.print(" ");
            }
            for (int st1 = 1; st1 <= i; st1++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int st = i; st >= 1; st--) {
                System.out.print("*");
            }
            for (int sp = (n - i) * 2; sp >= 1; sp--) {
                System.out.print(" ");
            }
            for (int st1 = i; st1 >= 1; st1--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        butterfly(n);
        sc.close();
    }
}
