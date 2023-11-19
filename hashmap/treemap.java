package hashmap;
import java.util.*;
public class treemap {
    public static void main(String arg[]){
        TreeMap<String , Integer> lhm = new TreeMap<>();
        lhm.put("india", 100 );
        lhm.put("us", 50);
        lhm.put("canada", 10);
        
        System.out.println(lhm);
    }
}
