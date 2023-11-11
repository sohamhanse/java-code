package BInary_Trees;

import java.util.*;

public class bottom_view_of_tree {
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

    static class info {
        tree t;
        int hd; // horizontal distance

        info(tree t, int hd) {
            this.hd = hd;
            this.t = t;
        }
    }

    public static void topview(tree t) {
        Queue<info> q = new LinkedList<>();
        HashMap<Integer, tree> map = new HashMap<>();
        q.add(new info(t, 0));
        q.add(null);
        int max = 0, min = 0;
        while (!q.isEmpty()) {
            info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {  
                    map.put(curr.hd, curr.t);
                if (curr.t.left != null) {
                    q.add(new info(curr.t.left, curr.hd - 1));
                    min = Math.min(curr.hd - 1, min);
                }
                if (curr.t.right != null) {
                    q.add(new info(curr.t.right, curr.hd + 1));
                    max = Math.max(curr.hd + 1, max);
                }
            }
        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data);
        }
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


        tree t = new tree(1);
        t.left = new tree(2);
        t.right = new tree(3);
        t.left.left = new tree(4);
        t.left.left.left = new tree(6);
        t.left.left.left.left = new tree(7);
        t.left.right = new tree(5);
        t.left.right.right = new tree(8);
        t.left.right.right.right = new tree(9);
        topview(t);
    }
}
