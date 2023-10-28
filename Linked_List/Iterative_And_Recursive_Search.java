package Linked_List;

public class Iterative_And_Recursive_Search {
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

    public int search(int key) {
        node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(int key, node head) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helper(key, head.next);
        // backtraking step where we add +1 to index so so that we can get position of
        // key and if we wont find we simply return -1
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public int recsearch(int key) {
        return helper(key, head);
    }

    

    public static node head;
    public static node tail;

    public static void main(String arg[]) {
        Iterative_And_Recursive_Search ll = new Iterative_And_Recursive_Search();
        ll.addfirst(5);
        ll.addfirst(4);
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        System.out.println(ll.search(3));
        System.out.println(ll.recsearch(10));
    }
}
