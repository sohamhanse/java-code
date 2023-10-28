package pattern;

import java.util.*;

public class hollow_tilted_rombus {

    public static void hollow_rombus(int totrow, int totcol) {
        for (int i = 1; i <= totrow; i++) {
            for (int k = 1; k <= totrow - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= totcol; j++) {
                if (i == 1 || j == 1 || i == totrow || j == totcol) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("total rows :- ");
        int totrow = sc.nextInt();
        System.out.print("total cols :- ");
        int totcol = sc.nextInt();
        hollow_rombus(totrow, totcol);
        sc.close();

    }
}