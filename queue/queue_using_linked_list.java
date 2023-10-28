package queue;

public class queue_using_linked_list {
    static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static node head;
    public static node tail;

     static class queue{
        public static boolean isempty(){
            return head == null;
        }
        public void add(int data){
            node newnode = new node(data);
            if(head == null ){
                head = tail = newnode;
            }
            tail.next = newnode;
            tail = newnode;
        }

        public int remove(){
            
            if(head == null){
                System.out.println("queue is empty");
                return -1;
            }
            int remove = head.data;
            head = head.next;
            return remove;
        }

        public int peek(){
            return head.data;
        }

        public void print(){
            node temp = head;
            while(temp != null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.print("null");
            System.out.println();
        }
    }
    public static void main(String arg[]){
        queue q = new queue();
        q.add(0);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();
        q.print();
        System.err.println(q.peek());
    }
}
