package greedy_algo;
import java.util.*;
public class activity_selection {
    public static void main(String arg[])
    {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     char ch = 'a';
     for(int i=1;i<=n;i++)
     {
        for(int j=1;j<=i;j++)
        {
            System.out.print(ch);                         //for pattern :- 1                                for :-a
             ch++;                                        //               12                                     bc
                                                          //               123                                    def
                                                          //               1234                                   hijk
                                                          //               just change line 12 ("*"= j)           just creat char ch=a, add ch++ in second loop 
        }
        System.out.println();
     }
     sc.close();
    }
}

