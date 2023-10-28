package recursion;

public class print_from_1_to_n {
    public static void print(int n){
        if(n==1){
            System.out.println(1);
            return ;
        }
        print(n-1);
        System.out.println(n);
    }
    public static void main(String arg[]){
        print(5);
    }
}
