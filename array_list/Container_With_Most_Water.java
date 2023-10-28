package array_list;
import java.util.*;
public class Container_With_Most_Water {
    public static int Most_Water(ArrayList<Integer>heigth){
        int st = 0;
        int ed = heigth.size()-1;
        int max = 0;
        while(st<ed){
            int hi = Math.min(heigth.get(st), heigth.get(ed));
            int wd = ed-st;
            int area = hi*wd;
            max = Math.max(area, max);
            if(st>ed){
                ed--;
            }else{
                st++;
            }
        }
        return max;
    }
    public static void main(String arg[]){
        ArrayList<Integer> heigth = new ArrayList<>();
        heigth.add(1);
        heigth.add(8);
        heigth.add(6);
        heigth.add(2);
        heigth.add(5);
        heigth.add(4);
        heigth.add(8);
        heigth.add(3);
        heigth.add(7);
        System.out.println(Most_Water(heigth));
    }
}
