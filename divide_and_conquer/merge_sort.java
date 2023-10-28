package divide_and_conquer;

public class merge_sort {
    public static void divide(int arr[],int st,int ed){
        if(st>=ed){
            return ; 
        }

        int mid = st+ (ed-st)/2;  // <-- (se+ed)/2  both are same 
        divide(arr,st,mid);
        divide(arr,mid+1,ed);

        merge(arr,st,ed,mid);
    } 

    public static void merge(int arr[],int st,int ed , int mid){
        int temp [] = new int [ed-st+1];
        int i = st;
        int j = mid+1 ;
        int k = 0;

        while(i<=mid && j <=ed ){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++]; 
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
    }

    public static void print(int arr[]){
         for(int i = 0 ; i<arr.length ; i++){
        System.out.print(arr[i] + " ");
         }
    }

    public static void main(String arg[]){
        int arr[] = {6,9,3,5,2,8};
        divide(arr, 0, arr.length-1);
        print(arr);
    }
}
