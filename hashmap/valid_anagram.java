package hashmap;
import java.util.*;
public class valid_anagram {
    public static void main(String arg[]){
        String s1 = "race";
        String s2 = "care";
        HashMap<Character , Integer> hm = new HashMap<>();
        for(int i = 0 ; i<s1.length() ; i++){
            Boolean cha = hm.containsKey(s1.charAt(i));
            if(cha){
                int count = hm.get(s1.charAt(i));
                count++;
                hm.put(s1.charAt(i), count);
            }else{
                hm.put(s1.charAt(i), 1);
            }
        }

        for(int i = 0 ; i<s2.length() ; i++){
            Boolean cha = hm.containsKey(s2.charAt(i));
            if(cha){
                int num = hm.get(s2.charAt(i));
                if(num > 1){
                    int count = hm.get(s2.charAt(i));
                    count-- ;
                    hm.put(s2.charAt(i), count);
                }else{
                    hm.remove(s2.charAt(i));
                }
            }else{
                System.out.println("not an anagram");
                break;
            }
        }
        if(hm.isEmpty()){
            System.out.println("an anagram");
        }
    }
}
