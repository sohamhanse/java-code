package Binary_Search_Tree;

public class two_sum_BSTs {
    static class tree {
        tree left;
        tree right;
        int data;

        tree(int data) {
            this.data = data;
        }
    }

    static int count = 0;

    public static void find(int val, tree t2, int k) {
        if (t2 == null) {
            return;
        }

        if (val + t2.data == k) {
            count++;
        }

        find(val, t2.left, k);
        find(val, t2.right, k);

    }

    public static int count_pair(tree t1, tree t2, int k) {
        if (t1 == null) {
            return count;
        }
        find(t1.data, t2, k);
        count_pair(t1.left, t2, k);
        count_pair(t1.right, t2, k);

        return count;
    }

    public static void main(String args[]) {
        tree root1 = new tree(5);
        root1.left = new tree(3);
        root1.right = new tree(7);
        root1.left.left = new tree(2);
        root1.left.right = new tree(4);
        root1.right.left = new tree(6);
        root1.right.right = new tree(8);

        tree root2 = new tree(10);
        root2.left = new tree(6);
        root2.right = new tree(15);
        root2.left.left = new tree(3);
        root2.left.right = new tree(8);
        root2.right.left = new tree(11);
        root2.right.right = new tree(18);

        count = 0;
        int k = 16;
        System.out.println(count_pair(root1, root2, k));
    }
}
