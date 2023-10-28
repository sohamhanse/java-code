package array_list;

import java.util.ArrayList;

public class Pair_Sum {
    public static boolean pair(ArrayList<Integer> element,int target){
        int st = 0;
        int ed = element.size()-1;
        while(st<ed){
            if(element.get(st)+element.get(ed) == target)
             return true;

             if(element.get(st)+element.get(ed) > target){
                ed--;
             } else{
                 st++;
             }   
        }
        return false;
    }
     public static void main(String arg[]){
        ArrayList<Integer> element = new ArrayList<>();
        element.add(0);
        element.add(1);
        element.add(2);
        element.add(3);
        element.add(4);
        element.add(5);
        System.out.println(pair(element, 10));
    }
}
