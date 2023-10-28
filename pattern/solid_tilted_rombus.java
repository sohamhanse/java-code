package pattern;
import java.util.*;
public class solid_tilted_rombus{

    public static void rombus(int n) {
        for(int i=1;i<=n;i++)
        {
            for(int sp=1;sp<=n-i;sp++)
            {
                System.out.print(" ");
            }
            for(int st=1;st<=n;st++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rombus(n);
        sc.close();

        
    }
}