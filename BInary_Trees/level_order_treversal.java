package BInary_Trees;
import java.util.*;
public class level_order_treversal {
    static class tree{
        int data;
        tree left;
        tree right;

        tree(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    static class binary_tree{
        static int idx = -1;
        public tree build(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            tree newtree = new tree(nodes[idx]);
            newtree.left = build(nodes);
            newtree.right = build(nodes);

            return newtree;
        }

        public  void level(tree root){
            if(root == null){
                return;
            }
            Queue<tree> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                tree curr = q.remove();
                if(curr == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(curr.data + " ");
                    if(curr.left != null){
                        q.add(curr.left);
                    }
                    if(curr.right != null){
                        q.add(curr.right);
                    }
                }
            }
        }
    }
    public static void main(String arg[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binary_tree trees = new binary_tree();
        tree root = trees.build(nodes);
        trees.level(root);
    }
}

