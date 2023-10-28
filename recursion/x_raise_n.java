package recursion;

public class x_raise_n {
    // public static int expo(int a, int n,int ans){
    //     // if(n == 0){
    //     //     return ans;
    //     // }
    //     //     if ((n & 1) != 0) {
    //     //         ans = ans * a;
    //     //     }
    //     //     a = a * a;
    //     //     n = n >> 1;

    //     // return expo(a, n, ans);

    //     // one more optimized way :-
     public static int expo(int a, int n){
        if(n == 0){
            return 1;
        }
        int half = expo(a, n/2) *  expo(a, n/2);

        if(n%2 != 0){
            half = a * half;
        }

        return half;
    }
    public static void main(String arg[]){
        int a = 5;
        int n= 5;
        // int ans = 1;
        System.out.println(expo(a,n));
}
}
