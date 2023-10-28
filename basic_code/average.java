package basic_code;

import java.util.*;
public class average 
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner (System.in);
        double a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        System.out.println("average :-"+ (a+b+c)/3);
        sc.close();
    }
}