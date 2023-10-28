package queue;

public class circular_queue_using_array {
    static class queue{
        static int arr[];
        static int rear;
        static int size;
        static int front;

        queue(int n){
            arr = new int[n];
            rear = -1;
            size = n;
            front = -1;
        }
        public boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean isfull(){
            return (rear+1)%size == front ; 
        }
        public void add(int data){
            if(isfull()){
                System.out.println("queue is full");
                return;
            }
            if(front == -1){
                front++;
            }
            rear = (rear+1) % size;
            arr[rear] = data;
        }
        public int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int result = arr[front];
            if(front == rear){
                front = rear = -1;
            }else{
                front = (front+1) % size;
            }
            return result;
        }
        public int peek(){
             if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void  main(String arg[]){
        queue q = new queue(5);
        q.add(0);
        q.add(2);
        q.add(4);
        q.add(6);
        System.out.println(q.remove());
        q.add(8);
        System.out.println(q.remove());
        q.add(10);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
