package hashmap;
import java.util.*;
public class count_distinct_element {
    public static void main(String arg[]){
        int arr[] = {4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> hs  = new HashSet<>();
        for(int i = 0 ; i<arr.length ;i++){
            hs.add(arr[i]);
        }
        System.out.println(hs.size());
    }
}
