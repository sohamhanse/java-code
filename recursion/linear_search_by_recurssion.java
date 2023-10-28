package recursion;

public class linear_search_by_recurssion {
    public static int first_posittion (int key , int arr[],int i){
        if(arr[i] == key){
            return i;
        }
        if(i == arr.length-1){
            return -1;
        }

        return first_posittion(key,arr,i+1);

    }

    public static int last_posittion (int key , int arr[],int i){
        // if(arr[i] == key){
        //     return i;
        // }
        // if(i == 0){
        //     return -1;
        // }

        // return last_posittion(key,arr,i-1);

        if(i == arr.length-1){
            return -1;
        }

        int found = last_posittion(key, arr, i+1);
        if(found == -1 && arr[i] == key){
            return i ;
        }

        return found;
    }
    public static void main(String arg[]){
        int arr [] = {2,4,5,6,7,5,9};
        int key = 5;
        int i = 0;
        System.out.println("first occurance :- " + first_posittion(key, arr, i));
        System.out.println("last occurance  :- " + last_posittion(key, arr, i));
    }
}
