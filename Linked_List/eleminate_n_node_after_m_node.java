package Linked_List;
public class eleminate_n_node_after_m_node {
    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static node delete(node head1, int m, int n) {
        node head = null;
        node crr = head1;
        node temp = head1;
        while (temp != null) {
            for (int i = 0; i < m && temp != null; i++) {
                if(head == null){
                    head = temp;
                }
                else{
                    head.next = temp;
                    head = head.next;
                }
                temp = temp.next;
            }

            for (int i = 0; i < n && temp != null; i++) {
                temp = temp.next;
            }

            if (head != null) {
                head.next = null; 
            }
        }
        head = crr;
        return  head;
    }

    // simplified version don't use above code

    // public static node delete(node head, int M, int N) {
    //     node current = head;
    //     node newHead = null;
    //     node newTail = null;
    
    //     while (current != null) {
    //         // Keep M nodes
    //         for (int i = 0; i < M && current != null; i++) {
    //             if (newTail == null) {
    //                 newTail = current;
    //             } else {
    //                 newTail.next = current;
    //                 newTail = current;
    //             }
    //             current = current.next;
    //         }
    
    //         // Delete N nodes
    //         for (int i = 0; i < N && current != null; i++) {
    //             current = current.next;
    //         }
    
    //         if (newTail != null) {
    //             newTail.next = null; // Disconnect the last node in the M nodes from the next part.
    //         }
    //     }
    
    //     return newHead;
    // }
    

    public static void print(node he) {
        node temp = he;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String arg[]) {
        node head1 = new node(1);
        head1.next = new node(2);
        head1.next.next = new node(3);
        head1.next.next.next = new node(4);
        head1.next.next.next.next = new node(5);
        head1.next.next.next.next.next = new node(6);
        head1.next.next.next.next.next.next = new node(7);
        head1.next.next.next.next.next.next.next = new node(8);
        node newnode = delete(head1, 1, 4);
        print(newnode);
    }
}
