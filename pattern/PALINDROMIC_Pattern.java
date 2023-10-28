package pattern;

import java.util.*;
public class PALINDROMIC_Pattern
{
   public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int sp=1;sp<=n-i;sp++)
            {
                System.out.print(" ");
            }
            for(int st=i;st>=1;st--)
            {
                System.out.print(st);
            }
            for(int pt2=2;pt2<=i;pt2++)
            {
                System.out.print(pt2);
            }
            System.out.println();
        }
        sc.close();
    }
}
/* 

 pattern:-
     1
    212
   32123
  4321234
 543212345
65432123456

*/