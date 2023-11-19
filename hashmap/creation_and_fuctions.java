package hashmap;
import java.util.*;
public class creation_and_fuctions {
    public static void main(String arg[]){
        HashMap<String , Integer> hm =new HashMap<>();

        hm.put("india", 100 );
        hm.put("us", 50);
        hm.put("canada", 10);

        System.out.println(hm); // will print all value present in hm 
        
        System.out.println(hm.containsKey("india")); // true
        System.out.println(hm.containsKey("china")); // false

        System.out.println( hm.remove("india")); //100

        System.out.println(hm.size()); // 2
        
        System.out.println(hm.isEmpty()); // false
    }
}
