package trees;

public class subtree_of_another_tree {
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

    public static boolean isidentical(tree t,tree sub){
        if(t == null && sub==null){
            return true;
        }else if(t == null||sub == null||t.data!= sub.data){
            return false;
        }

        if(!isidentical(t.left, sub.left)){
            return false;
        }
        if(!isidentical(t.right, sub.right) ){
            return false;
        }

        return true;
    }

    public static boolean issubtree(tree t,tree sub){
        if(t == null){
            return false;
        }

        if(t.data == sub.data){
            if(isidentical(t,sub)){
                return true;
            }
        }

        return issubtree(t.left, sub)|| issubtree(t.right, sub);
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
    
           // main tree 
           tree t = new tree(1);
           t.left = new tree(2);
           t.right = new tree(3);
           t.left.left = new tree(4);
           t.left.left.left = new tree(6);
           t.left.left.left.left = new tree(7);
           t.left.right = new tree(5);
           t.left.right.right = new tree(8);
           t.left.right.right.right = new tree(9);

        //           Sub Tree  
        //               2     
        //             /   \    
        //            4     5   
        //           /       \        
        //          6         8
        //         /           \      
        //        7             9

            // sub tree 
            tree sub = new tree(2);
            sub.left = new tree(4);
            sub.left.left = new tree(6);
            sub.left.left.left = new tree(7);
            sub.right = new tree(5);
            sub.right.right = new tree(8);
            sub.right.right.right = new tree(9);

            
            System.out.println(issubtree(t,sub));
        }
}
