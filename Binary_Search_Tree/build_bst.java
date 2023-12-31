package Binary_Search_Tree;
public class build_bst {
    static class tree{
        int data;
        tree left;
        tree right;

        tree(int data){
            this.data = data;
        }
    }

    public static tree build(tree t , int val){
        if(t == null){
            t = new tree(val);  // created new node and passed value
            return t;
        }

        if(t.data > val){
            t.left = build(t.left, val);
        }else{
            t.right = build(t.right, val);
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
        int arr [] = {6,2,13,1,4,9,15,-1,-1,-1,-1,-1,-1,14};
        tree t = null;
        for(int i = 0 ; i<arr.length ;i++){
            t = build(t, arr[i]);
        }

        inorder(t);
    }
}
