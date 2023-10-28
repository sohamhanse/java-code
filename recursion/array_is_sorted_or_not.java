package recursion;

public class array_is_sorted_or_not {
    public static boolean ar(int arr[], int i) {

        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return ar(arr, i + 1);
    }

    public static void main(String arg[]) {
        int arr[] = { 1, 2, 3, 4 };
        System.out.println(ar(arr, 0));
    }
}
