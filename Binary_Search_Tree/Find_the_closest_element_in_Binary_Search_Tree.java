package Binary_Search_Tree;

public class Find_the_closest_element_in_Binary_Search_Tree {
    static class tree{
        int data;
        tree left;
        tree right;

        tree(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int num = 0;
    public static int min = Integer.MAX_VALUE;
    public static int maxdiff(tree t , int k){
        if(t == null){
            return num;
        }
        int diff = Math.abs(k- t.data);
        if(diff < min){
            min = diff;
            num = t.data;
        }
        if(k < t.data){
            maxdiff(t.left, k);
        }
        if(k > t.data){ 
            maxdiff(t.right, k);
        }
        return num;
    }
    public static void main(String args[]){
        tree root = new tree(9); 
        root.left = new tree(4);
        root.right = new tree(17);
        root.left.left =new  tree(3);
        root.left.right =new tree(6);
        root.left.right.left = new tree(5);
        root.left.right.right = new tree(7);
        root.right.right = new tree(22);
        root.right.right.left = new tree(20);
        int k = 17;
        num = 0 ;
        System.out.println( maxdiff(root, k));
    }
}
