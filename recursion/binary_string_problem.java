package recursion;

public class binary_string_problem {
    public static void string_print(int n, String str, int last_integer) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        string_print(n - 1, str + "0", 0); // when last digit is any thing 0 or 1
        if (last_integer == 0) {
            string_print(n - 1, str + "1", 1); // when last digit is 1
        }
    }

    public static void main(String arg[]) {
        string_print(3, "", 0);
    }
}
