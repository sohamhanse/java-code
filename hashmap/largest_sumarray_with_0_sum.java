package hashmap;
import java.util.*;
public class largest_sumarray_with_0_sum {
    public static int getlength(int arr[]){
        HashMap<Integer , Integer> h = new HashMap<>();
        int high = 0;
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
            if(h.containsKey(sum)){
                int j = h.get(sum);
                if(i - j > high){
                    high = i-j;
                }
            }else{
                h.put(sum, i);
            }
        }

        return high;
    }
    public static void main(String arg[]){
        int arr [] ={15,-2,2,-8,1,7,10};
        System.out.println(getlength(arr));
    }
}
