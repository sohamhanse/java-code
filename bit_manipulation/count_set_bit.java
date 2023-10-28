package bit_manipulation;

import java.util.Scanner;

public class count_set_bit {
    public static int set_bit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number :- ");
        int n = sc.nextInt();
        System.out.println(set_bit(n));
        sc.close();
    }
}
