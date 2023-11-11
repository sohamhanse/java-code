package BInary_Trees;

public class post_order {
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
        public  void postorder(tree t){
            if(t == null){
                System.out.print("-1" + " ");
                return;
            }
            postorder(t.left);
            postorder(t.right);
           System.err.print(t.data+" ");

        }

    }

    public static void main(String arg[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binary_tree trees = new binary_tree();
        tree root = trees.build(nodes);
        trees.postorder(root);
    }
 }


