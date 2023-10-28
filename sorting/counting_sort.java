package sorting;

public class counting_sort {
    public static void sort(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        int count[] = new int[max+1];          // +1 is if our max is 10 then we have take 11 for going till 10 
                                               // because in array 0 also count so if we take 10 so we count till 9 only
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {  // for decrement order  (int i = count.length-1; i >=0 ; i--)
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void print_array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String arg[]) {
        int arr[] = { 1, 6, 8, 7, 4, 5, 4, 2, 5, 7, 1, 2, 6, 5 };
        sort(arr);
        print_array(arr);

    }
    
}
