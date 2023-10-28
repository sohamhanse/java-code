package Linked_List;

public class Detect_And_Delete_Loop_In_LL {
   public static class node{
        int data;
        node next;

        node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(int data){
        node newnode = new node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public static node head;
    public static node tail;
    public static node slow;
    public static node fast;

    public void print(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public boolean detect_loop(){
        slow = head;
        fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    } 

    

     public void delete_loop(){
        if(detect_loop()){
            slow = head;
            node prev = null;
            while(slow.next != fast.next){
                prev = fast;
                fast = fast.next;
                slow = slow.next;
            }
            prev.next = null;
        }
    } 

    public static void main(String arg[]){
        Detect_And_Delete_Loop_In_LL ll = new Detect_And_Delete_Loop_In_LL();
        head = new node(50);
        head.next = new node(20);
        head.next.next = new node(15);
        head.next.next.next = new node(4);
        head.next.next.next.next = new node(10);
 
        // Creating a loop for testing
        head.next.next.next.next.next = head.next.next; 
        System.out.println(ll.detect_loop());
        ll.delete_loop();
        ll.print();
    }
}
