package BInary_Trees;

public class minimum_dist_bet_two_nodes {
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
    public static tree lca(tree t,int n1,int n2){
        if(t == null || t.data == n1 || t.data == n2){
            return t;
        }

        tree left = lca(t.left, n1, n2);
        tree right = lca(t.right, n1, n2);

        if(left == null){
            return right;
        }
        if(right == null){
            return left;
        }

        return t;
    }

    public static int dis(int n , tree t ){
        if(t == null){
            return -1;
        }

        if(t.data == n){
            return 0;
        }

        int left = dis(n, t.left);
        int right = dis(n, t.right);

        if(left == -1 && right == -1){
            return -1;
        }else if(left > -1){
            return left+1;
        }else{
            return right+1;
        }
    }

    public static int min(int n1,int n2,tree t){
        tree lca = lca(t, n1, n2);

        int left = dis(n2, lca );
        int right = dis(n1 , lca);

        return left+right;
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
        
        System.out.println(min(5, 7, t));        
    }
}
