package array;


public class binary_search {
    public static int binary(int number[],int key)
    {
        int start = 0;
        int end = number.length-1;
         while(start<=end)
         {
            int mid = (start+end)/2;

            if(number[mid] == key)
            {
                return mid;
            }
            if(number[mid]<key)
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
         }

         return -1;
    }

    public static void main(String arg[])
    {
        int number[] = {1,2,6,8,9};
        int key = 8;
        System.out.println( binary(number,key));
    }
}
