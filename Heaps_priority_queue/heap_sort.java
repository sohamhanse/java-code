package Heaps_priority_queue;
public class heap_sort {
    public static void heapify(int arr[], int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxidx = i;

        if (left < size && arr[maxidx] < arr[left]) {
            maxidx = left;
        }
        if (right < size && arr[maxidx] < arr[right]) {
            maxidx = right;
        }

        if (maxidx != i) {
            int temp = arr[maxidx];
            arr[maxidx] = arr[i];
            arr[i] = temp;

            heapify(arr, maxidx, size);
        }
    }

    public static void heapsort(int arr[]) {
        for (int i = (arr.length) / 2; i >= 0; i--) {
            heapify(arr, i, arr.length);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapify(arr, 0, i);
        }
    }

    public static void main(String arg[]) {
        int arr[] = { 1, 2, 4, 6, 3 };
        heapsort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
