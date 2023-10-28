package array;

import java.util.*;

public class print_subarray {

    public static void largest_and_smallest(int sum_st[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < sum_st.length; i++) {
            if (sum_st[i] > largest) {
                largest = sum_st[i];
            }
            if (sum_st[i] < smallest) {
                smallest = sum_st[i];
            }
        }

        System.out.println("largest number of array :- " + largest);
        System.out.println("smallest number of array :- " + smallest);
    }

    public static void sub_array(int number[], int n) {
        Scanner sc = new Scanner(System.in);
        // int ts = 0;
        for (int i = 0; i < number.length; i++) {
            int sum_st[] = new int[n - i];
            // int l = 0;
            for (int j = i; j < number.length; j++) {
                // int sum = 0;
                for (int k = i; k <number.length; k++) {
                //     System.out.print(number[k] + " ");
                //     sum = sum + number[k];
                // }
                // sum_st[l] = sum;
                // ts++;
                // l++;
                // System.out.println();
                System.out.println("{"+ number[i] + "," +  number[j]+","+ number [k] +"}");
            }
        }
            // largest_and_smallest(sum_st);
            System.out.println();
        }
        // System.out.println("total sub array :- " + ts);
        sc.close();
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many number do you want to enter : - ");
        int n = sc.nextInt();
        int number[] = new int[n];
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        System.out.print("entered array :- ");
        for (int j = 0; j < number.length; j++) {
            System.out.print(number[j] + " ");
        }
        System.out.println();
        sub_array(number, n);
        sc.close();
    }
}
