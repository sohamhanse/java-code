import java.security.SecureRandom;
import java.util.Arrays;

public class SimpleArray {
    private final static SecureRandom sRandom = new SecureRandom();
    private int arr[];
    private int writeInx = 0;

    public SimpleArray(int size){
        arr = new int[size];
    }
    public synchronized void add(int value){
        int position = writeInx;
        try {
            Thread.sleep(sRandom.nextInt(500));
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        arr[position] = value;
        System.out.printf("%s wrote %2d to element %d \n",Thread.currentThread().getName(),value,position);
        ++writeInx;
        System.out.printf("Next write Index : %d \n",writeInx);
    }
    public String toString(){
        return Arrays.toString(arr);
    }
}
