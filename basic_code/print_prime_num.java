package basic_code;

import java.util.*;
public class print_prime_num 
{

    public static Boolean prime_num(int n)
    {
        Boolean isprime = true;
        if(n==2)
        {
            isprime = true;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                isprime = false;
                break;
            }
        }
        return isprime;
    }
    
    public static void range_prime (int n)
    {
        for(int i=2;i<=n;i++)
        {
            if(prime_num(i))
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String arrg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        range_prime(n);
        sc.close();

    }
    
}
