package hashmap;
import java.util.*;
public class linkedhashset {
    public static void main(String arg[]){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(5);
        set.add(5);
        set.add(6);
        set.add(2);
        set.add(3);

        System.out.println(set);

        set.remove(5);

        System.out.println(set.contains(5));

        System.out.println(set);

    }
}
