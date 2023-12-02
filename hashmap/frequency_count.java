package hashmap;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class frequency_count {
    public static void main(String arg[]){
        String str = "cccaaa";
        HashMap<Character , Integer> h = new HashMap<>();
        for(int i= 0 ; i<str.length(); i++){
            if(h.containsKey(str.charAt(i))){
                int count = h.get(str.charAt(i));
                count++;
                h.put(str.charAt(i), count);
            }else{
                h.put(str.charAt(i), 1);
            }
        }
        PriorityQueue<Map.Entry<Character,Integer>>pq=new PriorityQueue<>((a,b)->a.getValue()==b.getValue()?a.getKey()-b.getKey():b.getValue()-a.getValue());
        Set<Character> a  = h.keySet();
        for (Character i : a) {
            pq.add(new AbstractMap.SimpleEntry<>(i, h.get(i)));
        }

        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> entry = pq.poll();
            for (int i = 0; i < entry.getValue(); i++) {
                System.out.print(entry.getKey());
            }
        }        
    }
}
