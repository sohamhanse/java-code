package Linked_List;

public class even_odd_ll {
    static class node{
        int data ;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static node even_odd(node head1) {
        node head = null;
        node he = null; // Initialize he outside of the loop
        node temp = head1;
        node head2 = null;
        node he2 = null; // Initialize he2 outside of the loop
    
        while (temp != null) {
            if (temp.data % 2 == 0) {
                if (head == null) {
                    head = temp;
                    he = head; // Store the head of the new list
                } else {
                    head.next = temp;
                    head = head.next;
                }
            } else {
                if (head2 == null) {
                    head2 = temp;
                    he2 = head2; // Store the head of the new list
                } else {
                    head2.next = temp;
                    head2 = head2.next;
                }
            }
            temp = temp.next;
        }
        head2.next =null;
    
        if (head != null) {
            head.next = he2; // Connect the even list with the odd list
        } else {
            return he2; // If there are no even numbers, return the odd list
        }
    
        return he; // Return the head of the rearranged list
    }
    

    public static void print(node he) {
        node temp = he;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String arg[]){
        node head1 = new node(8);
        head1.next = new node(12);
        head1.next.next = new node(10);
        head1.next.next.next = new node(5);
        head1.next.next.next.next = new node(4);
        head1.next.next.next.next.next = new node(1);
        head1.next.next.next.next.next.next = new node(6);

        node newnode = even_odd(head1);
        print(newnode);
    }
}
