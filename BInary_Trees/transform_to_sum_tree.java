package BInary_Trees;

public class transform_to_sum_tree {
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

    public static int sum(tree t){
        if (t == null){
            return 0;
        }

        int left = sum( t.left);
        int right = sum(t.right);
        int data = t.data;
        int newleft = t.left == null ? 0 : t.left.data;
        int newright = t.right == null ? 0 : t.right.data;
        t.data = left + right + newleft + newright;
        return data ;
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
        //             Main Tree 
        //                   1
        //                /    \
        //               2      3
        //             /   \   /  \
        //            4     5 6    7


        tree t = new tree(1);
        t.left = new tree(2);
        t.right = new tree(3);
        t.left.left = new tree(4);
        t.left.right = new tree(5);
        t.right.left = new tree(6);
        t.right.right = new tree(7);
        
        // t.left.left.left = new tree(6);
        // t.left.left.left.left = new tree(7);
        // t.left.right.right = new tree(8);
        // t.left.right.right.right = new tree(9);
        sum(t);
        in(t);
    }
}
