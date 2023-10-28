package array;
public class array_length {
    public static void main(String arg[]) {
        int array[] = { 1, 2, 3, 4, 5 };
        int sc = 1;
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (sc == array[mid]) {
                System.out.println(array[mid]);

            } else if (sc < array[mid]) {
                end = mid - 1;
                
            } else {
                start = mid + 1;
            }
        }
    }
}
