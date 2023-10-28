package Linked_List;

import basic_code.print_prime_num;

public class Reverse_LL {
    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;

    }
    public void reverse(){
        node prev =null;
        node curr = tail = head;  // we made 1st as tail and assign and head value to curr
        while(curr != null){
            node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
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
        Reverse_LL ll = new Reverse_LL();
        ll.addfirst(5);
        ll.addfirst(4);
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        System.out.println("Normal LL");
        ll.print();
        ll.reverse();
        System.out.println("Reversed LL");
        ll.print();
    }
}
