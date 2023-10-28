package basic_code;

import java.util.*;

public class binary_to_decimal_and_decimal_to_binary {

    public static int binary_to_decimal(int n) {
        int ld = 0;
        int dig = 0;
        for (int i = 0; n != 0; i++) {
            ld = n % 10;
            dig = dig + (int) (ld * Math.pow(2, i));
            n = n / 10;
        }
        return dig;
    }

    public static int decimal_to_binary(int n) {
        int rem = 0;
        int dig = 0;
        for (int i = 0; n != 0; i++) {
            rem = n % 2;
            dig = dig + (rem * (int) (Math.pow(10, i)));
            n = n / 2;
        }
        return dig;
    }

    public static void main(String arg[]) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("if you want binary to decimal press 0 & if you want decimal to binary press 1");
        System.out.print("press 0 or 1 :- ");
        int choice = sc.nextInt();

        if (choice == 0) {
            System.out.print("binary number  :- ");
            int n = sc.nextInt();
            int dig = binary_to_decimal(n);
            System.out.println("decimal number :- " + dig);
        }

        if (choice == 1) {

            System.out.print("decimal number :- ");
            int l = sc.nextInt();
            int dig = decimal_to_binary(l);
            System.out.println("binary number  :- " + dig);
        }

        sc.close();
    }
}
