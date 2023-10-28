package bit_manipulation;
import java.util.Scanner;
public class update_ith_bit {

    public static int set_ith_bit(int n,int i) {

        int bitmask = 1<<i;
        return n|bitmask;
    }

    public static int clear_ith_bit(int n,int i) {

         int bitmask = ~(1<<i);
         return n & bitmask;
    }

public static int update_bit(int n,int i,int new_bit) {

    if(new_bit == 0){
        return clear_ith_bit(n, i);
    }
    else
    {
       return set_ith_bit(n, i);
    }
    // more efficient way  
    // n= clear_ith_bit(n, i);
    // int bitmask=new_bit<<i;
    //  return n|bitmask;

}
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :- ");
        int n = sc.nextInt();
        System.out.print("enter which bit of num want to update :- ");
        int i = sc.nextInt();
        System.out.print("conver Ith position into ? :- ");
        int new_bit = sc.nextInt();
        System.out.println(update_bit(n,i,new_bit));
        sc.close();
    }
}
