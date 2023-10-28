package pattern;
import java.util.*;

public class hollow_rectangle {
      public static void hollow_rect_pattern(int totrow, int totcol) {
            for (int i = 1; i <= totrow; i++) {
                  for (int j = 1; j <= totcol; j++) {
                        if (i == 1 || j == 1 || i == totrow || j == totcol) {
                              System.out.print("*" + " ");
                        } else {
                              System.out.print(" " + " ");
                        }
                  }
                  System.out.println();
            }
      }

      public static void main(String arg[]) {
            Scanner sc = new Scanner(System.in);
            System.out.print("total rows :- ");
            int totrow = sc.nextInt();
            System.out.print("total column :- ");
            int totcol = sc.nextInt();
            hollow_rect_pattern(totrow, totcol);
            sc.close();
      }

}
