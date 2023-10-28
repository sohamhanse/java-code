package array_list;

import java.util.*;;

public class Basic_Operation {
    public static void main(String arg[]){
        ArrayList <Integer> list = new ArrayList<>();

        // add element 
        // we use .add to add at last
        // time complexity : - O(1)

            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            System.out.println(list);

        // to add at specific location 
        // here we add 12 at position 1 and pust other element to right
        // time complexity : - O(n)

            // list.add(1, 12);
            // System.out.println(list);

        // to get element from array list

            // int i = list.get(2);
            // System.out.println(i);
        
        // to remove element 

            // list.remove(2);
            // System.out.println(list);

        // to set means change the number 
        // here we set element wont add 

            // list.set(2, 12);
            // System.out.println(list);

        // to look is element contains or not 
        // if it contain then you will get true 
            
            //System.out.println(list.contains(2)); 
            //System.out.println(list.contains(16)); 

        // to get size of array 

            //System.out.println(list.size());
        
    }
}