package array;

public class deleting_repeating_element {
    public static void main(String[] args) {
        int a[] = { 2, 2, 3, 3, 4, 4, 4, 5, 6, 6 };

        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[count++] = a[i];
            }
        }

        a[count++] = a[a.length - 1];

        for (int j = 0; j < count; j++) {
            System.out.print(a[j] + " ");
        }
    }
}
