package recursion;

public class fubonacci {
    public static int fub(int n){
        if(n==0 || n==1){
            return n;
        }
        int fubona = fub(n-1)+fub(n-2);
        return fubona;
    }

    public static void main(String arg[]){
        System.out.println(fub(5));
    }
}
