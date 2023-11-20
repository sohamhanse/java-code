package hashmap;
import java.util.*;
public class mejority_element {
    public static void main(String arg[]){
        int arr[] = {1,3,2,5,1,3,1,5,1};
        int n = arr.length;
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i = 0 ; i< arr.length ;i++){
            boolean num = hm.containsKey(arr[i]);
            if(!num){
                hm.put(arr[i], 1);
            }else{
                int count = hm.get(arr[i]);
                count++;
                hm.put(arr[i], count);
            }
        }
        int t = n/3;
        Set<Integer> k = hm.keySet();
        for (Integer i : k) {
            if(hm.get(i) > t){
                System.out.println(i);
            }
        }
    }
}
