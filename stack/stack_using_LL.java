package stack;

public class stack_using_LL {
    
       public static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
public static class stack{
      node head = null;
     public boolean isEmpty(){
        return head == null ;
     }
     public void push(int data){
        node newnode = new node(data);
        if(isEmpty()){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
     }

     public int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = head.data;
        head = head.next;
        return top;
     }

     public int peek(){
        return head.data;
     }
    }

    public static void main(String arg[]){
        stack s  =new stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
