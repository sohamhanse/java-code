package trees;
import java.util.*;
public class lowest_common_ansister {
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
    
    public static boolean path(int data, tree t, ArrayList<tree> s) {
        if (t == null) {
            return false;
        }
        if (t.data == data) {
            s.add(t);
            return true;
        }
        s.add(t);
        if (path(data, t.left, s) || path(data, t.right, s)) {
            return true;
        }
        s.remove(s.size() - 1);
        return false;
    }

    public static tree lca (tree t , int n1 ,int n2 ){
      ArrayList<tree> s1 = new ArrayList<>();
      ArrayList<tree> s2 = new ArrayList<>();  
      path(n1, t, s1);
      path(n2, t, s2);
      int i =0 ;
      for(;i<s1.size() && i<s2.size();i++){
        if(s1.get(i)!= s2.get(i)){
            break;
        }
      }

      return s1.get(i-1);
    }



    // more efficiant we nod using any arraylist to store path 
    // and we are not travling whole tree for several times to che create path 
    public static tree lca2(tree t,int n1,int n2){
        if(t == null || t.data == n1 || t.data == n2){
            return t;
        }

        tree left = lca2(t.left, n1, n2);
        tree right = lca2(t.right, n1, n2);

        if(left == null){
            return right;
        }
        if(right == null){
            return left;
        }

        return t;
    }
    

    public static void main(String arg[]){
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
        
        System.out.println(lca2(t, 7, 5).data);        
    }
}
