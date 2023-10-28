package recursion;
class count_substrings_with_same_first_and_last_characters {
    // Function to count substrings
    // with same first and
    // last characters
    static int countSubstrs(String str, int st,
            int ed, int n) {
        // base cases
        if (n == 1)
            return 1;
        if (n <= 0)
            return 0;

        // A or B = A + B - A union B
        // A --> only starting index will get a head but ending index will not change
        // B --> only ending index will get a back but starting index will not change
        // A union B --> both starting and ending index go a head and back same time

        // we are doing n-1 because we go ahead by 1 in string so we need to decrease
        // string length so decrease string length by 1 so base case should satisfy at
        // some point
        
        int res = countSubstrs(str, st + 1, ed, n - 1) + countSubstrs(str, st, ed - 1, n - 1)
                - countSubstrs(str, st + 1, ed - 1, n - 2);

        if (str.charAt(st) == str.charAt(ed))
            res++;

        return res;
    }

    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
        System.out.print(countSubstrs(str, 0, n - 1, n));
    }
}
