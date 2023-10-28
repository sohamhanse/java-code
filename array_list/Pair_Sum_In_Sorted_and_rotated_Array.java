package array_list;

import java.util.ArrayList;

public class Pair_Sum_In_Sorted_and_rotated_Array {
     public static boolean pair(ArrayList<Integer> element,int target){
        int bp = -1;
        for(int i = 0 ; i < element.size()-1; i++){
            if(element.get(i)>element.get(i+1)){
                bp = i;
            }
        }
        int st = bp+1;
        int ed = bp;
        int n = element.size();
        while(st!=ed){
            if(element.get(st)+element.get(ed) == target)
             return true;

             if(element.get(st)+element.get(ed) > target){
                ed = (ed + n - 1) % n;
             } else{
                 st = (st +1) % n ;
             }   
        }
        return false;
    }
     public static void main(String arg[]){
        ArrayList<Integer> element = new ArrayList<>();
        element.add(11);
        element.add(15);
        element.add(6);
        element.add(7);
        element.add(8);
        element.add(9);
        System.out.println(pair(element, 16));
    }
}
