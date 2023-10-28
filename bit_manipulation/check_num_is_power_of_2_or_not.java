package bit_manipulation;

import java.util.Scanner;

public class check_num_is_power_of_2_or_not {
    public static boolean power_of_2_or_not(int n) {
        return (n & (n-1)) == 0;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :- ");
        int n = sc.nextInt();
        System.out.println(power_of_2_or_not(n));
        sc.close();
    }

}
