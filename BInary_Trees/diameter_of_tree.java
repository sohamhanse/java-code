package BInary_Trees;

public class diameter_of_tree {

    static class tree {
        int data;
        tree left;
        tree right;

        tree(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static int height(tree t) {
        if (t == null) {
            return 0;
        }

        int leftSum = height(t.left);
        int rightSum = height(t.right);

        return Math.max(leftSum, rightSum)+1;
    }

    public static int diameter(tree t){
        if(t == null){
            return 0;
        }
        int lh = height(t.left);
        int rh = height(t.right);

        return lh+rh+1;
    }

    public static int max_diameter(tree t){
        int ld = diameter(t.left);
        int rd = diameter(t.right);
        int lh = height(t.left);
        int rh = height(t.right);
        int selfd = lh + rh + 1;

        return Math.max(Math.max(rd, ld), selfd);
    }

    public static void main(String arg[]) {
    //                 1
    //               /   \
    //              2     3
    //             /  \    
    //            4    5   
    //           /      \        
    //          6        8
    //         /          \      
    //        7            9

    // max diameter is 7-6-4-2-5-8-9
        tree t = new tree(1);
        t.left = new tree(2);
        t.right = new tree(3);
        t.left.left = new tree(4);
        t.left.left.left = new tree(6);
        t.left.left.left.left = new tree(7);
        t.left.right = new tree(5);
        t.left.right.right = new tree(8);
        t.left.right.right.right = new tree(9);
        System.out.println(max_diameter(t));
    }
}
