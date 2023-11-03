package trees;

public class diameter_of_tree_efficient {
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

    static class info {
        int h;
        int dia;

        public info(int h, int dia) {
            this.h = h;
            this.dia = dia;
        }
    }

    public static info max_diameter(tree t) {
        if (t == null) {
            return new info(0, 0);
        }

        info leftinfo = max_diameter(t.left);
        info rightinfo = max_diameter(t.right);

        int max_dia = Math.max(Math.max(leftinfo.dia, rightinfo.dia), leftinfo.h + rightinfo.h + 1);
        int ht_max = Math.max(leftinfo.h, rightinfo.h) + 1;

        return new info(ht_max, max_dia);
    }

    public static void main(String arg[]) {
    //                  1
    //               /    \
    //              2       3
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
        System.out.println(max_diameter(t).dia);
    }
}
