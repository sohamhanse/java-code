package Linked_List;

public class Zig_Zag {
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

    public void mid() {
        slow = head;
        fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
    }

    public node pali(node head) {
        node zig = head;
        if (head == null || head.next == null) {
            return head;
        }
        mid();

        node curr = slow;
        node prev = null;
        while (curr != null) {
            node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node right = prev;
        node left = head;
        node newright, newleft;
        while (right != null && left != null) {
            newleft = left.next;
            left.next = right;
            newright = right.next;
            right.next = newleft;

            left = newleft;
            right = newright;
        }
        return zig;
    }

    public void print() {
        node temp = head;
        while (temp != null) {
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

    public static void main(String arg[]) {
        Zig_Zag ll = new Zig_Zag();
        ll.addfirst(5);
        ll.addfirst(4);
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.print();
        ll.pali(head);
        ll.print();
    }
}
