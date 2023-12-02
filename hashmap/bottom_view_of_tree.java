package hashmap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class bottom_view_of_tree {
    static class tree {
        int data;
        tree left, right;

        tree(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class pair{
        int n;
        tree t;

        pair(int n , tree t){
            this.n = n;
            this.t = t;
        }
    }

    public static void vertical(tree t){
        TreeMap<Integer, ArrayList<tree>> map = new TreeMap<>();
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(0, t));
        while(!q.isEmpty()){
            pair curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(map.containsKey(curr.n)){
                    map.get(curr.n).add(curr.t);
                }else{
                    ArrayList<tree> a = new ArrayList<>();
                    a.add(curr.t);
                    map.put(curr.n, a);
                }
                if(curr.t.left != null){
                    q.add(new pair(curr.n - 1, curr.t.left));
                }
                if(curr.t.right != null){
                    q.add(new pair(curr.n + 1, curr.t.right));
                }
            }
        }

        Set<Integer> s = map.keySet();
        for (Integer i : s) {
            System.out.print(map.get(i).get(map.get(i).size()-1).data+" ");
        }
    }

    public static void verticalprint(){

    }

    public static void main(String[] args) {
        //             Main Tree :- 1 2 4 5 3 6 7 (inorder)
        //                   1
        //                /    \
        //               2      3
        //             /   \   /  \
        //            4     5 6    7

        //answer:- 4 2 6 3 7
                   
        tree t = new tree(1);
        t.left = new tree(2);
        t.right = new tree(3);
        t.left.left = new tree(4);
        t.left.right = new tree(5);
        t.right.left = new tree(6);
        t.right.right = new tree(7);
        
        vertical(t);
    }
}
