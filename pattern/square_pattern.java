package pattern;

import java.util.*;
public class square_pattern
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner (System.in);
        int i = sc.nextInt();
        for(int k=1;k<=i;k++)
        {
            for(int m=1;m<=i;m++)
            {
                System.out.print("*"+" ");
            }
            System.out.println("\n");
        }
        sc.close();
      
    }
}

