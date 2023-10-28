package bit_manipulation;
import java.util.*;
public class odd_or_even {
    public static void oddeven(int n) {
        if((n & 1) == 0)
        {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :- ");
        int n = sc.nextInt();
        oddeven(n);
        sc.close();
    }
}
