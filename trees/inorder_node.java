package trees;

public class inorder_node {
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
        public  void inorder(tree t){
            if(t == null){
                System.out.print("-1" + " ");
                return;
            }
            inorder(t.left);
             System.err.print(t.data+" ");
            inorder(t.right);
           

        }

    }

    public static void main(String arg[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binary_tree trees = new binary_tree();
        tree root = trees.build(nodes);
        trees.inorder(root);
    }
 }

