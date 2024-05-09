import java.security.SecureRandom;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


class ArrayWriter implements Runnable{
    private final SimpleArray sharedSimpleArray;
    private final int startValue;
    public ArrayWriter(int value, SimpleArray array){
        this.startValue = value;
        this.sharedSimpleArray = array;

    }
    
    public void run() {
        // TODO Auto-generated method stub
        for (int i = startValue; i < startValue+3; i++) {
            sharedSimpleArray.add(i);
        }
    }
}

class SimpleArray{
    private final static SecureRandom sRandom= new SecureRandom();
    private int arr[];
    private int writeInx = 0;
    public SimpleArray(int size){
        arr = new int[size];
    }
    public synchronized void add(int value){
        int position = writeInx;
        try {
            Thread.sleep(sRandom.nextInt(500));
        } catch (InterruptedException e) {
            // TODO: handle exception
            e.printStackTrace();

        }
        arr[position] = value;
        System.out.printf("%s wrote %2d to element %d \n", Thread.currentThread().getName(),value,position);
        ++writeInx;
        System.out.printf("Next write index: %d \n", writeInx);

    }

    public String toString(){
        return Arrays.toString(arr);
    }
}

public class SharedArrayTest {
    public static void main(String[] args) {
        SimpleArray sharedSimpleArray = new SimpleArray(6);

        ArrayWriter writer1 = new ArrayWriter(1, sharedSimpleArray);
        ArrayWriter writer2 = new ArrayWriter(11, sharedSimpleArray);

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(writer1);
        executorService.execute(writer2);

        executorService.shutdown();

        try {
            boolean taskend = executorService.awaitTermination(1, TimeUnit.MINUTES );
            if (taskend) {
                System.out.printf("%n Content of SimpleArray: %n");
                System.out.println(sharedSimpleArray);
            }else{
                System.out.println("Timed out while waiting for the task finished.");
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        
    }
}
