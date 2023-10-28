package sorting;

public class bubble_sort {
    public static void sort(int array[]) {
        for (int turn = 0; turn < array.length - 1; turn++) {
            int swap = 0;
            for (int j = 0; j < array.length - 1 - turn; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap++;
                }
            }
            if (swap == 0) {
                return;
            }
        }
    }

    public static void print_array(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }

    public static void main(String arg[]) {
        int array[] = { 5, 1, 3, 2, 4 };
        sort(array);
        print_array(array);

    }
}
