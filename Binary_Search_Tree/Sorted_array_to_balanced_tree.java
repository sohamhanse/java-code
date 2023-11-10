package Binary_Search_Tree;

public class Sorted_array_to_balanced_tree {
    static class tree{
        tree left ;
        tree right;
        int data;
        tree(int data){
            this.data = data;
        }
    }

    public static tree build(int val[] , int st , int ed ){
        if(st>ed){
            return null;
        }
        int mid = (st+ed)/2;
        tree newnode = new tree(val[mid]);
        newnode.left =  build(val, st, mid-1);
        newnode.right = build(val, mid+1, ed);
        return  newnode;
    }

    public static void inorder(tree t){
        if(t == null){
            return ;
        }
        
        inorder(t.left);
        System.out.print(t.data + " ");
        inorder(t.right);
    } 

     public static tree mirror(tree t ){
        if(t == null){
            return null ;
        }
        tree left = mirror(t.left);
        tree right = mirror(t.right);

        t.left = right;
        t.right = left;

        return t;
     }

    public static void main(String arg[]){
        int arr [] = {3,5,6,8,10,11,12};
        tree t = null;
        t = build(arr,0,arr.length-1);
        System.out.print("Original Bst :- ");
        inorder(t);
        System.out.println();
        // it is returning same means it is correct because in order they print sequencially
    }
}
