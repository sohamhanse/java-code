package sorting;

public class selection_sort {
    public static void sort(int array[]) {
        for(int i=0;i<array.length-1;i++)
        {
            int min_pos=i;
            for(int j=i+1;j<array.length;j++)
            {
                if(array[min_pos]>array[j])
                {
                    min_pos=j;
                }
            }
            int temp = array[min_pos];
            array[min_pos]=array[i];
            array[i]=temp;
        }
    }
    public static void print(int array[]) {
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
    int array[]={2,9,6,4,7} ;
    sort(array);
    print(array);
    }
}
