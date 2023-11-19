package hashmap;

import java.util.*;

public class linked_hashmap {
    public static void main(String arg[]){
        HashMap<String , Integer> hm =new HashMap<>();

        hm.put("india", 100 );
        hm.put("us", 50);
        hm.put("canada", 10);

        System.out.println(hm); //for referance that lhm is print in series is not coincident
        
        LinkedHashMap<String , Integer> lhm = new LinkedHashMap<>();

        lhm.put("india", 100 );
        lhm.put("us", 50);
        lhm.put("canada", 10);
        
        System.out.println(lhm);
    }
}
