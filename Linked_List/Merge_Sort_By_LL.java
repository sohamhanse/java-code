package Linked_List;

public class Merge_Sort_By_LL {

    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
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

    public void addfirst(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = tail = newnode;
            size++;
            return;
        }
        newnode.next = head;
        head = newnode;
        size++;
    }

    public node mid(node head) {
        node slow = head;
        node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public node merge(node left, node right) {
        node mergell = new node(-1);
        node temp = mergell;
        while (left != null && right != null) {
            if (left.data > right.data) {
                temp.next = right;
                temp = temp.next;
                right = right.next;
            } else {
                temp.next = left;
                temp = temp.next;
                left = left.next;
            }
        }
        while (left != null) {
            temp.next = left;
            temp = temp.next;
            left = left.next;
        }
        while (right != null) {
            temp.next = right;
            temp = temp.next;
            right = right.next;
        }

        return mergell.next;
    }

    public node mergesort(node head) {
        if (head == null || head.next == null) {
            return head;
        }
        node mid = mid(head);
        node right = mid.next;
        mid.next = null;
        node newleft = mergesort(head);
        node newright = mergesort(right);
        return merge(newleft, newright);
    }

    public static node head;
    public static node tail;
    public static int size;

    public static void main(String arg[]) {
        Merge_Sort_By_LL ll = new Merge_Sort_By_LL();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.addfirst(5);
        ll.print();
        head = ll.mergesort(head);
        ll.print();
    }
}
