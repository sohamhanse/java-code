package Binary_Search_Tree;


public class delete_node {
    static class tree{
        tree left ;
        tree right;
        int data;
        tree(int data){
            this.data = data;
        }
    }

    public static tree build(tree t , int val){
        if(t == null){
            t = new tree(val);
            return t;
        }

        if(val < t.data){
            t.left = build(t.left, val);
        }else{
            t.right = build(t.right, val);
        }
        return  t;
    }

    public static tree inorder_succesor( tree t){
        while(t.left != null){
            t = t.left;
        }
        return t;
    }

    public static tree  delete(int val , tree t){

        if(t.data > val){
            t.left = delete(val, t.left);
        }else if(t.data < val){
            t.right = delete(val, t.right);
        }else{
            if(t.left == null && t.right == null){
                return null;
            }
            if(t.left == null){
                return t.right;
            }
            if(t.right == null){
                return t.left;
            }

            tree in = inorder_succesor(t.right);
            t.data = in.data;
            t.right = delete(in.data, t.right);
        }

        return t;
           
    }
    public static void inorder(tree t){
        if(t == null){
            return ;
        }

        inorder(t.left);
        System.out.print(t.data + " ");
        inorder(t.right);
    }    
    
    public static void main(String arg[]){
        int arr [] = {8,7,9,2,6,5,4,1,3};
        tree t = null;
        for(int i = 0 ; i<arr.length ;i++){
            t = build(t, arr[i]);
        }
        inorder(t);
        System.out.println();
        delete(6, t);
        inorder(t);
        System.out.println();
    }
}
