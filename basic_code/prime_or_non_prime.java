package basic_code;

import java.util.*;
public class prime_or_non_prime
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :-");    
        int a = sc.nextInt();
        
        if(a==2){
            System.out.println(a+"is a prime number");
        }
        else{
            Boolean isprime = true;
            for(int i=2;i<=Math.sqrt(a);i++)
            {
                if( a%i==0 ){
                  isprime = false;
                }
            }
            if(isprime == true){
                System.out.println("prime");
               
            }
            else{
                System.out.println("non prime");
            }
        }
        sc.close();
   
   }
}
        