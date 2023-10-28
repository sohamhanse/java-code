package bit_manipulation;
import java.util.Scanner;
public class clear_range_of_bit {
     public static int ith_bit(int n,int i,int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
         int bitmask = a|b;   // -1/0  = ....111111111
         return (n & bitmask);
    }
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :- ");
        int n = sc.nextInt();
        System.out.print("enter start:- ");
        int i = sc.nextInt();
        System.out.print("enter end  :- ");
        int j = sc.nextInt();
        System.out.println(ith_bit(n,i,j));
        sc.close();
    }
}
