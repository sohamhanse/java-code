package array;

import java.util.*;

public class reverse_array {

    public static void reverse(int number[]) {
        int first = 0, last = number.length - 1;
        while(first<last)
        {
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;
            first++;
            last--;
        }

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
            System.out.print(number[j]+" ");
        }
        System.out.println();

        reverse(number);

        System.out.print("reverse array :- ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
        }
        sc.close();
    }
}