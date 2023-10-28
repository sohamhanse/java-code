package sorting;

public class insertion_sort {
    public static void sort(int arr[]) {
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        } 
    }  
    public static void print_array(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    public static void main(String arg[]) {
        int arr[]={1,6,8,7,4};
        sort(arr);
        print_array(arr);

    } 
}