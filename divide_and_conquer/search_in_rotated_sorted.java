package divide_and_conquer;

public class search_in_rotated_sorted {
    public static int find(int arr[], int si, int ei, int tar) {

        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;

        if (arr[mid] == tar) {
            return mid;
        }

        if (arr[mid] >= arr[ei]) {
            if (tar <= arr[mid] && tar >= arr[si]) {
                return find(arr, si, mid - 1, tar);
            } else {
                return find(arr, mid + 1, ei, tar);
            }
        }

        else {
            if (tar <= arr[ei] && tar >= arr[mid]) {
               return  find(arr, mid + 1, ei, tar);
            } else {
               return find(arr, si, mid - 1, tar);
            }
        }
    }

    public static void main(String arg[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(find(arr, 0, arr.length-1,1));
    }
}
