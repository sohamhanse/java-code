package BInary_Trees;

public class kth_ancestor {
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

    public static int ancestor(int n , int k ,tree t){
        if (t == null){
            return -1;
        }
        if(t.data == n ){
            return 0;
        }

        int left = ancestor(n, k, t.left);
        int right = ancestor(n, k, t.left);
        if(left == -1 && right == -1){
            return  -1;
        }
        int max = Math.max(left, right);
        if(max +1 == k){
            System.out.println(t.data);
        }
        return max +1;
    }
    
    public static void main(String arg[]){
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
        
        ancestor(6,3,t); 
    }
}
