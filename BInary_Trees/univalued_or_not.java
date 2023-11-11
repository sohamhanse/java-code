package BInary_Trees;

public class univalued_or_not {
    static class tree{
        int data;
        tree left;
        tree right;
        tree(int data){
            this.left = null;
            this.right = null;
            this.data = data;
        }
    }
   static boolean helper(tree root, int a){
        if(root==null) {
            return true;
        }
        if(root.data != a){
            return false;
        } 

        return helper(root.left,a) && helper(root.right,a);
    }
    public static boolean isUnivalTree(tree root) {
         if(root == null){
            return true;
        }
    
        return helper(root,root.data);
    }
    
    public static void main(String arg[]){
        //             Main Tree 
        //                   2
        //                /    \
        //               2      2
        //             /   \   /  \
        //            2     2 2    2



        tree t = new tree(2);
        t.left = new tree(2);
        t.right = new tree(2);
        t.left.left = new tree(2);
        t.left.right = new tree(2);
        t.right.left = new tree(2);
        t.right.right = new tree(2);
        System.out.println(isUnivalTree(t));
        
    }
}
