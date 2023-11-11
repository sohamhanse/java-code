package BInary_Trees;
public class creation_from_preorder_and_print_tree {
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

        public  void preorder(tree root){
            if(root == null){
                System.out.print("-1" + " ");
                return;
            }

            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void main(String arg[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binary_tree trees = new binary_tree();
        tree root = trees.build(nodes);
        System.out.println(root.data);
        trees.preorder(root);
    }
}
