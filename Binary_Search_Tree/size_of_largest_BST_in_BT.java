package Binary_Search_Tree;

public class size_of_largest_BST_in_BT {

    static class tree {
        tree left;
        tree right;
        int data;

        tree(int data) {
            this.data = data;
        }
    }

    static class info {
        boolean bool;
        int size;
        int max;
        int min;

        info(boolean bool, int size, int max, int min) {
            this.bool = bool;
            this.size = size;
            this.max = max;
            this.min = min;
        }
    }

    public static int maxlen = 0;

    public static info largestHelper(tree t) {
        if (t == null) {
            return new info(true, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        info left = largestHelper(t.left);
        info right = largestHelper(t.right);
        int size = left.size + right.size + 1;
        int max = Math.max(t.data, Math.max(left.max, right.max));
        int min = Math.min(t.data, Math.min(left.min, right.min));

        if (t.data <= left.max || t.data >= right.min) {
            return new info(false, size, max, min);
        }

        if (left.bool && right.bool) {
            maxlen = Math.max(maxlen, size);
            return new info(true, size, max, min);
        }

        return new info(false, size, max, min);
    }

    public static void inorder(tree t) {
        if (t == null) {
            return;
        }

        inorder(t.left);
        System.out.print(t.data + " ");
        inorder(t.right);
    }

    public static void main(String arg[]) {
        //      50
        //    /    \
        //   30     60
        //  /  \    / \
        // 5   20  45  70
        //            /  \
        //           65   80
        //
        
        tree t = new tree(50);
        t.left = new tree(30);
        t.left.left = new tree(5);
        t.left.right = new tree(20);

        t.right = new tree(60);
        t.right.left = new tree(45);
        t.right.right = new tree(70);
        t.right.right.left = new tree(65);
        t.right.right.right = new tree(80);
        // inorder(t);

        //        60
        //       /  \
        //      45   70
        //          /  \
        //        65    80
        // largest bst in bt = 5

        maxlen = 0; // Reset maxlen to 0
        largestHelper(t);
        System.out.println(maxlen);
    }
}
