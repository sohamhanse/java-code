package recursion;
public class tilling {
    public static int tilling_1(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        int var = tilling_1(n-1);
        int hor = tilling_1(n-2);

        return var + hor ;
    }
    public static void main(String arg[]){
       System.out.println(tilling_1(4)); 
    }
}
