package Binary_Search_Tree;

public class validate_bst {
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

    public static void inorder(tree t){
        if(t == null){
            return ;
        }

        inorder(t.left);
        System.out.print(t.data + " ");
        inorder(t.right);
    } 

     public static boolean validate(tree t , tree min , tree max){
        if(t == null){
            return true;
        }
        if(min != null && t.data <= min.data){
            return false;
        }
        if(max != null && t.data >= max.data){
            return false;
        }

        return validate(t.left, min, t) && validate(t.right, t, max);
     }

    public static void main(String arg[]){
        int arr [] = {8,7,9,2,6,5,4,1,3};
        tree t = null;
        for(int i = 0 ; i<arr.length ;i++){
            t = build(t, arr[i]);
        }
        inorder(t);
        System.out.println();
        System.out.println(validate(t, null, null));
    }
}
