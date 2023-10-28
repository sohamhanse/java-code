package basic_code;

import java.util.*;
public class reverse_of_given_num
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number want to reverse :-");
        int a = sc.nextInt();
        int remainder=0 ;
        int rev =0;
       while(a!=0)
        {
            remainder= a%10;
            rev= rev*10+remainder;
             a=a/10;
        }

        System.out.print(rev);   
    sc.close();
    }

}