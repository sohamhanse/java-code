
package array_list;
import java.util.*;
class mostFrequent {
    public static int solution(ArrayList<Integer> arr, int key) {
        int ans [] = new int [1001];
        for(int i = 0 ; i<arr.size()-1;i++){
            if(arr.get(i) == key){
                ans[arr.get(i+1)]++;
            }
        }
        int pos = 0;
         for(int i = 0 ; i<ans.length;i++){
            if(ans[pos] < ans[i]){
               pos = i ;
            }
        }
        return pos;
    }
    public static void main(String arg[]){
        ArrayList<Integer> arr = new ArrayList<>();
        int key = 1 ;
        arr.add(1);
        arr.add(100);
        arr.add(200);
        arr.add(1);
        arr.add(100);
        System.out.println(solution(arr,key));
    }
}