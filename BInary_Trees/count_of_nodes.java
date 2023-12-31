package BInary_Trees;

public class count_of_nodes {
    static class tree{
        int data;
        tree left ;
        tree right;
        tree(int data){
            this.data =data;
            left = null;
            right = null;
        }
    }

    public static int sumOfNodes(tree t) {
        if (t == null) {
            return 0;
        }

        int leftSum = sumOfNodes(t.left);
        int rightSum = sumOfNodes(t.right);

        return leftSum + rightSum + t.data;
    }
    public static void main(String arg[]){
    //       1
    //    /    \
    //   2       3
    //  /  \    / \
    // 4   5   6   7
    //              \
    //               8
    // 
        tree t = new tree(1);
        t.left = new tree(2);
        t.right = new tree(3);
        t.left.left = new tree(4);
        t.left.right = new tree(5);
        t.right.left = new tree(6);
        t.right.right = new tree(7);
        t.right.right.right = new tree(8);
        System.out.println(sumOfNodes(t));
    }
}
