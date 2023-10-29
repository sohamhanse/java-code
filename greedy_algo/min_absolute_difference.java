package greedy_algo;
import java.util.*;
public class min_absolute_difference {
    public static void main(String arg[]){
         int a[] = {4,1,7,8};
         int b[] = {2,3,5,6};
         Arrays.sort(a);
         Arrays.sort(b);
         int mindiff = 0;
         for(int i =0 ;i< a.length ;i++){
            mindiff += Math.abs(a[i] - b[i]);
         }
         System.out.println(mindiff);
    }
   
    
}
