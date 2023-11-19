package hashmap;

import java.util.*;
public class ireration_in_hashmap {
     public static void main(String arg[]){
        HashMap<String , Integer> hm =new HashMap<>();

        hm.put("india", 100 );
        hm.put("us", 50);
        hm.put("canada", 10);

        System.out.println(hm);                            
        Set<String> key = hm.keySet();                                                   
        for (String k : key) {
            System.out.println("key = " + k + ",value = " + hm.get(k));
        }  
    }
}
