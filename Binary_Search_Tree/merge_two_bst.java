package Binary_Search_Tree;

import java.util.ArrayList;

public class merge_two_bst {
    static class tree {
        tree left;
        tree right;
        int data;

        tree(int data) {
            this.data = data;
        }
    }

    public static tree build_balanced(ArrayList<Integer> a, int st, int ed) {
        if (st > ed) {
            return null;
        }
        int mid = (st + ed) / 2;
        tree newnode = new tree(a.get(mid));
        newnode.left = build_balanced(a, st, mid - 1);
        newnode.right = build_balanced(a, mid + 1, ed);
        return newnode;
    }

    public static void inorder(tree t, ArrayList<Integer> a) {
        if (t == null) {
            return;
        }

        inorder(t.left, a);
        a.add(t.data);
        inorder(t.right, a);
    }

    public static void inorder1(tree t) {
        if (t == null) {
            return;
        }

        inorder1(t.left);
        System.out.print(t.data + " ");
        inorder1(t.right);
    }

    public static void sort(ArrayList<Integer> a1, ArrayList<Integer> a2, ArrayList<Integer> a3) {
        int i = 0, j = 0;
        while (i < a1.size() && j < a2.size()) {
            if (a1.get(i) < a2.get(j)) {
                a3.add(a1.get(i));
                i++;
            } else {
                a3.add(a2.get(j));
                j++;
            }
        }

        while (i < a1.size()) {
            a3.add(a1.get(i));
            i++;
        }

        while (j < a2.size()) {
            a3.add(a2.get(j));
            j++;
        }
    }

    public static tree merged_tree(tree t1, tree t2) {
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<Integer> a3 = new ArrayList<>();
        inorder(t1, a1);
        inorder(t2, a2);
        sort(a1, a2, a3);
        return build_balanced(a3, 0, a3.size()-1);
    }

    public static void main(String arg[]) {
        tree t1 = new tree(2);
        t1.left = new tree(1);
        t1.right = new tree(4);

        tree t2 = new tree(9);
        t2.left = new tree(3);
        t2.right = new tree(12);


        tree t3 = merged_tree(t1, t2);

        inorder1(t3);
    }
}
