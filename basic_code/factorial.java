package basic_code;
import java.util.*;
public class factorial {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("write a number whose factorial you want :- ");
        int n = sc.nextInt();
        int fac = 1;

        for(int i=n;i>=1;i--)
        {
            fac = fac*i;
        }
        System.out.println("factorial of "+ n +" is :- "+ fac );
        sc.close();
    }
    
}
