package array;
public class search_in_rotated_sorted_array {
    public static int min_search(int num[]) {
        int left = 0;
        int right = num.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (num[mid] < num[mid - 1]) {
                return mid;
            } else if (num[mid] > num[left] && num[mid] > num[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static int search(int num[], int target) {
        int min = min_search(num);
        if (num[min] <= target && target <= num[num.length]) {
            search(num, target, min, num.length);
        } else {
            search(num, target, 0, min);
        }
        return -1;
    }

    public static int search(int num[], int target, int left, int right) {
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (num[mid] == target) {
                return mid;
            } else if (num[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String arg[]) {
        int num[] = { 4, 5, 6, 7, 1, 2, 3 };

        System.out.println(search(num, 6, 0, num.length));
    }
}


