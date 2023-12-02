package hashmap;
import java.util.*;
public class union_and_intersection {
    public static void main(String arg[]){
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        HashSet<Integer> union = new HashSet<>();
        for(int i = 0 ; i<arr1.length ; i++){
            union.add(arr1[i]);
        }
        for(int i = 0 ; i<arr2.length ;i++){
            union.add(arr2[i]);
        }

        HashSet<Integer> intersection = new HashSet<>();
        for(int i = 0 ; i<arr1.length ; i++){
            intersection.add(arr1[i]);
        }
        int count = 0 ;
        for(int i = 0 ; i<arr2.length ; i++){
            if(intersection.contains(arr2[i])){
                count++; 
                intersection.remove(arr2[i]); // we are removing so it wont count again
            }
        }

        System.out.println("Union Count :- " + union.size());
        System.out.println("Intersection Count :- " + count);
    }
}
