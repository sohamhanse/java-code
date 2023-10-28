package Linked_List;

public class Palindrome {
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

    public void mid(){
        slow = head;
        fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
    }

    public boolean pali(){
        if(head == null || head.next == null){
            return true;
        }
        mid();
        node curr = slow;
        node prev = null;
        while(curr != null){
            node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node right = prev;
        node left = head;

        while(right != null){
            if(right.data != left.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
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
    public static node slow;
    public static node fast;

    public static void main(String arg[]){
        Palindrome ll = new Palindrome();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.print();
        System.out.println(ll.pali());
    }
}
