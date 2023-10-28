package array_list;
import java.util.*;
public class monotonic_arraylist {
    public static boolean monotonic (ArrayList<Integer> arr){
        boolean increase = true;
        boolean decrease = true;
        for(int i = 0;i<arr.size()-1;i++){
            if(arr.get(i)>= arr.get(i+1)){
               decrease = false;
            }
             if(arr.get(i)<= arr.get(i+1)){
               increase = false;
            }
        }
        return increase || decrease ;
    }
    public static void main(String arg[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(5);
        System.out.println(monotonic(arr));
    
    }
}
