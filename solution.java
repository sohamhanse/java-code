/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;
class Solution {
    public static class TreeNode {
      int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
    //  TreeNode(int val, TreeNode left, TreeNode right) {
    //      this.val = val;
    //      this.left = left;
    //      this.right = right;
    //  }
 }
    public static void inorder(TreeNode root,ArrayList<Integer> a){
        if(root == null){
            return ;
        }
        inorder(root.left,a);
        a.add(root.val);
        inorder(root.right,a);

    }
    public static void closest(List<List<Integer>> l ,int k ,ArrayList<Integer> a){
        int count = 0;
        int min = -1;
        while(a.size() > count){
            int diff = k - a.get(count) ;
            if(diff > 0 && diff < a.get(min)){
                min = count;
            }
            count++;
        }
        List<Integer> list = new ArrayList<Integer>();
        if(min == -1 && k < a.get(a.size()-1)){
          list.add(a.get(a.size()-1));
          list.add(min);  
        }else if(min == -1){
            list.add(min);
            list.add(a.get(min+1));
        }else if(a.get(min) == k){
            list.add(k);
            list.add(k);
        }else{
            list.add(a.get(min));
            list.add(a.get(min+1));
        }
        l.add(list);
    }
    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        int i =0 ; 
        while(queries.size() > i){
           closest(list ,queries.get(i) , a);
           i++;
        }
        return list;
    }
     public static TreeNode build(TreeNode t , int val){
        if(t == null){
            t = new TreeNode(val);  // created new node and passed value
            return t;
        }

        if(t.val > val){
            t.left = build(t.left, val);
        }else{
            t.right = build(t.right, val);
        }

        return t;
    }

    public static void main(String arg[]){
        int val [] = {6,2,13,1,4,9,15,-1,-1,-1,-1,-1,-1,14} ;
        TreeNode t = null;
        for(int i = 0 ; i< val.length ; i++){
            t = build(t, val[i]);
        }
        List<List<Integer>> list = new ArrayList<>();
        list = closest(l);
    }
}