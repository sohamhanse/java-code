package divide_and_conquer;

public class Find_the_Inversion_Countin_the_array {
    public static int divide(int arr[],int st,int ed,int count){

        // same logic as merge sort just some modification

        if(st>=ed){
            return count;                 // modified line
        }
         int mid = st+ (ed-st)/2;  
             divide(arr,st,mid,count);
             divide(arr,mid+1,ed,count);

            count+= merge(arr,st,ed,mid);  // modified line

        return count;                     // line added
    } 

    public static int merge(int arr[],int st,int ed , int mid){
        int temp [] = new int [ed-st+1];
        int i = st;
        int j = mid+1 ;
        int k = 0;
        int c = 0;                        // line added

        while(i<=mid && j <=ed ){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++]; 
                c++;                       // line added
            }
            else{
                temp[k++] = arr[j++];
            }
        }

        while(i<=mid){
            temp[k++] = arr[i++]; 
        }
        while(j <= ed){
             temp[k++] = arr[j++];
        }

        for(k = 0 , i = st ; i<temp.length ; i++,k++){
            arr[i] = temp[k];
        }
        
        return c;                              // line added 
    }

    public static void print(int arr[]){
         for(int i = 0 ; i<arr.length ; i++){
        System.out.print(arr[i] + " ");
         }
    }

    public static void main(String arg[]){
        int arr[] = {2,4,1,3,5}; 
        int count =0;                            // line added
        System.out.println(divide(arr, 0, arr.length-1,count));      // modified
        print(arr);
    }
}
