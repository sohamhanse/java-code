package divide_and_conquer;

public class quick_sort {
    public static void quicksort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pivotindex = partition(arr, si, ei);
        quicksort(arr, si, pivotindex - 1);
        quicksort(arr, pivotindex + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei]; // as we decide to take last element as pivot so li is last index
        int i = si-1;
        for (int j = si; j < ei; j++) {
            if (pivot > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[++i];
                arr[i] = temp;
            }
        }

        int temp = pivot;
        arr[ei] = arr[++i]; // here we did not take pivot because we dont have to change pivot value we have
                            // to chage arr[ei] position value therefore we take arr[ei]
        arr[i] = temp;

        return i;
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String arg[]) {
        int arr[] = {6,3,9,8,2,5};
        quicksort(arr, 0, arr.length - 1);
        print(arr);
    }
}