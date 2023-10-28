package array;

public class prefix_sum {
    public static void main(String arg[]){
        int arr[] = { 2, 8, 5, -6, -4  };
        int curr_sum = 0 ;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
         prefix[0]= arr[0];
        for(int i = 1 ; i< arr.length;i++){
            prefix[i]= arr[i]+prefix[i-1];
        }
        for (int i = 0; i < arr.length; i++) { //i = start
            for (int j = i; j < arr.length; j++) { // j = end
               curr_sum =  i==0 ? prefix[j] : prefix[j]-prefix[i-1] ;
               if(curr_sum >max){
                  max = curr_sum;
               }
            }
        }
        System.out.println(max);
    }
}
