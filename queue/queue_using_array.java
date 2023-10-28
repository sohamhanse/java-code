package queue;

public class queue_using_array {
    static class queue{
        static int arr[];
        static int rear;
        static int size;
        queue(int n){
            arr = new int[n];
            rear = -1;
            size = n;
        }
        public boolean isEmpty(){
            return rear == -1;
        }
        public void add(int data){
            if(rear == size-1){
                System.out.println("queue is empty");
                return;
            }
            rear++;
            arr[rear] = data;
        }
        public int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i = 0 ; i<rear ;i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        public int peek(){
             if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void  main(String arg[]){
        queue q = new queue(5);
        q.add(0);
        q.add(2);
        q.add(4);
        q.add(6);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
    
}
