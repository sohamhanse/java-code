package bit_manipulation;

import java.util.Scanner;

public class get_Ith_bit {
    public static int ith_bit(int n,int i) {

         int bitmask = 1<<i;
          if((n & bitmask) == 0)
        {
            return 0;
        }
        else{
            return 1;
        }
    }
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :- ");
        int n = sc.nextInt();
        System.out.print("enter which bit of num want to get :- ");
        int i = sc.nextInt();
        System.out.println(ith_bit(n,i));
        sc.close();
    }
}
    

