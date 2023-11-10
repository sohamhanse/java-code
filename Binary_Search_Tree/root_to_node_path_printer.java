package Binary_Search_Tree;

import java.util.ArrayList;

public class root_to_node_path_printer {
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

     public static void rootToLeaf(tree t, ArrayList<Integer> path) {
        if (t == null) {
            return;
        }
        
        path.add(t.data);
        
        if (t.left == null && t.right == null) {
            for (int i = 0; i < path.size(); i++) {
                System.out.print(path.get(i) + " ");
            }
            System.out.println("null");
        }
            rootToLeaf(t.left, path);
            rootToLeaf(t.right, path);
            path.remove(path.size() - 1);
    }

    public static void main(String arg[]){
        int arr [] = {8,7,9,2,6,5,4,1,3};
        tree t = null;
        for(int i = 0 ; i<arr.length ;i++){
            t = build(t, arr[i]);
        }
        inorder(t);
        System.out.println();
        ArrayList <Integer> a =new ArrayList<>();
        rootToLeaf(t,a);
    }
}
