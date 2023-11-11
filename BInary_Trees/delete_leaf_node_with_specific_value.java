package BInary_Trees;
public class delete_leaf_node_with_specific_value {
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

    public static void in(tree t){
        if(t == null){
            return;
        }
        System.out.print(t.data+" ");
        in(t.left);
        in(t.right);
        
    }

    public static void delete(tree root, int x) {
    if (root == null) {
        return;
    }

    if (root.left != null && root.left.data == x && root.left.left == null && root.left.right == null) {
        // Node's left child is a leaf node with value x, so we delete it
        root.left = null;
    }

    if (root.right != null && root.right.data == x && root.right.left == null && root.right.right == null) {
        // Node's right child is a leaf node with value x, so we delete it
        root.right = null;
    }

    // Recursively delete leaf nodes with value x in the left and right subtrees
    delete(root.left, x);
    delete(root.right, x);
}

    public static void main(String arg[]){
        //             Main Tree :- 1 2 4 5 3 6 7 (inorder)
        //                   1
        //                /    \
        //               2      3
        //             /   \   /  \
        //            6     5 6    7

        
        tree t = new tree(1);
        t.left = new tree(2);
        t.right = new tree(3);
        t.left.left = new tree(6);
        t.left.right = new tree(5);
        t.right.left = new tree(6);
        t.right.right = new tree(7);
        in(t);
        System.out.println();
        delete(t,6);
        in(t);
        
    }
}
