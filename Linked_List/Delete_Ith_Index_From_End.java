package Linked_List;

public class Delete_Ith_Index_From_End {
    class node{
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

    public void remove_nth_from_end(int i){
        node temp = head;
        int size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        if(i == size){
            head = head.next;    // <-- it is remove first operation
            return;
        }

        node prev = head;
        int ithloc = size - i;
        int ithpos = 1;

        while(ithpos < ithloc){
            prev = prev.next;
            ithpos++;
        }

        prev.next = prev.next.next;  // <-- point prev.next to prev.next ka next
    }

    public void print(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static node head;
    public static node tail;
    public static void main(String arg[]){
        Delete_Ith_Index_From_End ll = new Delete_Ith_Index_From_End();
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.print();
        ll.remove_nth_from_end(2);
        ll.print();
    }
}
