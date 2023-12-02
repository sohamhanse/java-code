package hashmap;
import java.util.*;

public class Find_Itinerary_for_Tickets {
    public static void main(String args[]) {
        HashMap<String, String> ft = new HashMap<>();
       
        ft.put("chennai", "bengaluru");
        ft.put("mumbai", "delhi");
        ft.put("goa", "chennai");
        ft.put("delhi", "goa");

        HashMap<String, String> tf = new HashMap<>();
        tf.put("bengaluru", "chennai");
        tf.put("delhi", "mumbai");
        tf.put("chennai", "goa");
        tf.put("goa", "delhi");

        String start = "";
        Set<String> s = ft.keySet();
        for (String str : s) {
            if (tf.containsValue(str)) {
                start = str;
                break;
            }
        }

        LinkedList<String> l = new LinkedList<>();
        while (ft.containsKey(start)) {
            l.add(start);
            start = ft.get(start);
        }
        l.add(start);
        while (!l.isEmpty()) {
            System.out.println(l.removeFirst());
        }
    }
}

