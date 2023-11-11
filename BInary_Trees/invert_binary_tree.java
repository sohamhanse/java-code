package BInary_Trees;

public class invert_binary_tree {
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
    
    static void invert(tree root){
        if(root == null){
            return;
        }

        tree data = root.right;
        root.right = root.left;
        root.left = data;

        invert(root.left);
        invert(root.right);
    }
    public static tree invertTree(tree root) {
        if(root == null){
            return root;
        }
        invert(root);
        return root;
    }

    public static void in(tree t){
        if(t == null){
            return;
        }
        System.out.print(t.data+" ");
        in(t.left);
        in(t.right);
        
    }

    public static void main(String arg[]){
        //             Main Tree :- 1 2 4 5 3 6 7 (inorder)
        //                   1
        //                /    \
        //               2      3
        //             /   \   /  \
        //            4     5 6    7

        //            invert :- 1 3 7 6 2 5 4 
        //                   1
        //                /    \
        //               3      2
        //             /   \   /  \
        //            7     6 5    4

        
        tree t = new tree(1);
        t.left = new tree(2);
        t.right = new tree(3);
        t.left.left = new tree(4);
        t.left.right = new tree(5);
        t.right.left = new tree(6);
        t.right.right = new tree(7);
        in(t);
        invertTree(t);
        in(t);
        
    }
}
