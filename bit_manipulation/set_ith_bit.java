package bit_manipulation;

import java.util.Scanner;

public class set_ith_bit {
    public static int ith_bit(int n,int i) {

        int bitmask = 1<<i;
        return n|bitmask;
    }
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :- ");
        int n = sc.nextInt();
        System.out.print("enter which bit of num want to set :- ");
        int i = sc.nextInt();
        System.out.println(ith_bit(n,i));
        sc.close();
    }
}
    

