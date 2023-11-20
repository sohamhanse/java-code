package hashmap;
import java.util.*;
public class hashset {
    public static void main(String arg[]){
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(5);
        set.add(6);
        set.add(2);
        set.add(3);

        System.out.println(set);

        set.remove(5);

        System.out.println(set.contains(5));

        System.out.println(set);

        // Iterator k = set.iterator();
        // while(k.hasNext()){
        //     System.out.println(k.next());
        // }
        //               ^
        // alternate way |

        for (Integer i : set) {
            System.out.println(i);
        }

    }
}
