package Binary_Search_Tree;

public class search_in_bst {
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

    public static boolean search(int val , tree t){
        if(t == null){
            return false;
        }
        if(t.data == val){
            return true;
        }
        if(t.data > val){
            return search(val, t.left);
        }else{
             return search(val, t.right);
        }
           
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
        System.out.println(search(10, t));
    }
}
