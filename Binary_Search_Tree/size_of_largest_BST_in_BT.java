package Binary_Search_Tree;

public class size_of_largest_BST_in_BT {
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

    public static void main(String arg[]){
        tree t = new tree(50);
        t.left = new tree(30);
        t.left.left = new tree(5);
        t.left.right = new tree(20);

        t.right = new tree(60);
        t.right.left = new tree(45);
        t.right.right = new tree(70);
        t.right.right.left = new tree(65);
        t.right.right.right = new tree(80);
    }
}
