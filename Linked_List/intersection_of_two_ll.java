package Linked_List;

public class intersection_of_two_ll {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }

   
   public static node intersection(node head1 , node head2){
    while(head2 != null){
        node temp = head1;
        while(temp != null ){
            if(temp == head2){
                return head2;
            }
            temp = temp.next;
        }
        head2 =head2.next;
    }
    return null;
   }
    public static void main(String arg[]){
        
        node head1 = new node(1);
        node head2 = new node(4);

        node newnode = new node(2);
        head1.next = newnode;

        newnode = new node(3);
        head1.next.next = newnode;

        node newnode2 = new node(6);
        head1.next.next.next = newnode2;
        head2.next = newnode2;

        newnode = new node(9);
        head1.next.next.next.next = newnode;

        node result = intersection(head1, head2);
        if (result == null){
            System.out.println("no any intersection point found");
        }
        else{
            System.out.println("the intersection point is :- " + result.data);
        }
    }


}
