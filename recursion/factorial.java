package recursion;

public class factorial {
    public static int fact(int n){
        int facto ;
        if(n==0){
            return 1;
        }
        facto = n * fact(n-1);
        return facto;
    }

    public static void main(String arg []){
        System.out.println(fact(5));
    }
}
