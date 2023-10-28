package array;
import java.util.*;

public class smallest_and_largest_num_in_array {
    public static void largest_and_smallest(int number[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {
                largest = number[i];
            }
            if (number[i] < smallest) {
                smallest = number[i];
            }
        }

        System.out.println("largest number of array :- " + largest);
        System.out.println("smallest number of array :- " + smallest);
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many number do you want to enter : - ");
        int n = sc.nextInt();
        int number[] = new int[n];
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        largest_and_smallest(number);

        sc.close();
    }
}