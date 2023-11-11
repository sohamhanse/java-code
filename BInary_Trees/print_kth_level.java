package BInary_Trees;
public class print_kth_level {
    static class tree{
        int data;
        tree left;
        tree right;

        tree(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static void level(tree t,int level ,int k){
        if(t == null){
            return;
        }
        if(k == level){
            System.out.print(t.data + " ");
        }

        level(t.left, level+1, k);
        level(t.right, level+1, k);
    }
    public static void main(String arg[]) {

        //             Main Tree 
        //                 1
        //               /   \
        //              2     3
        //             /  \    
        //            4    5   
        //           /      \        
        //          6        8
        //         /          \      
        //        7            9


        tree t = new tree(1);
        t.left = new tree(2);
        t.right = new tree(3);
        t.left.left = new tree(4);
        t.left.left.left = new tree(6);
        t.left.left.left.left = new tree(7);
        t.left.right = new tree(5);
        t.left.right.right = new tree(8);
        t.left.right.right.right = new tree(9);
        level(t , 1 , 4);
    }
}
