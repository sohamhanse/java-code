package Linked_List;

public class Create_Linked_list {
    public static class node {
        int data;
        node next; // here we create class object inside same object

        node(int data) {
            this.data = data;
            this.next = null; // here we define an default value of next(address of next node ) as null
        }
    }

    public static node head;
    public static node tail;

    public static void main(String arg[]) {
        Create_Linked_list ll = new Create_Linked_list();
         head = new node(1); // here we decleare 1 as head and add value to node
        head.next = new node(2); // here we declare next(address) of next nodo(number)

        // here we need to always change the value of head and tail that is drawback so
        // next code will help to reduce that drawback(head & tail)
    }
}
