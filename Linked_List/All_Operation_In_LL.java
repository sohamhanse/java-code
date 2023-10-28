package Linked_List;

public class All_Operation_In_LL {
    public static class node {
        int data;
        node next; // here we create class object inside same object

        node(int data) {
            this.data = data;
            this.next = null; // here we define an default value of next(address of next node ) as null
        }
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

    public void addlast(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = tail = newnode;
            size++;
            return;
        }
        tail.next = newnode;
        tail = newnode;
        size++;
    }

    public void add(int index, int data) {
        if (index == 0) { // we add this step so head should change its value when we replace at zero th
                          // position.
            addfirst(data);
            return;
        }
        node temp = head;
        node newnode = new node(data);
        int i = 0;
        while (i == index - 1) {
            newnode.next = temp.next;
            temp.next = newnode;
            size++;
            return;
        }
        i++;
        temp = temp.next;
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

    // public int size(){
    // node temp = head;
    // int i = 0;
    // while(temp != null){ // or we declare size as static and and add size in
    // every fuction where we add element into linked list
    // i++;
    // temp = temp.next;
    // }
    // return i;
    // }

    public void Remove_First() {
        if (size == 0) {
            System.out.println("The LL Is Empty");
            return;
        } else if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }
        head = head.next;
        size--;
        return;
    }

    public void remove_Last() {
        if (size == 0) {
            System.out.println("The LL Is Empty");
            return;
        } else if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }
        node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        prev.next = null;
        tail = prev;
        size--;
        return;
    }

    

    public static node head;
    public static node tail;
    public static int size;

    public static void main(String arg[]) {
        All_Operation_In_LL ll = new All_Operation_In_LL();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(3);
        ll.add(0, 0);
        ll.Remove_First();
        ll.remove_Last();
        ll.print();
        System.out.println(size);
    }
}
