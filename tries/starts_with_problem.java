package tries;

public class starts_with_problem {
    static class node{
        node children[] = new node[26];
        boolean eow = false;
        node(){
            for(int i = 0 ; i<children.length ;i++){
                children[i] = null;
            }
        }
    }

    public static node root = new node();

    public static void insert(String word){
        node curr = root;
        for(int i= 0 ; i<word.length() ; i++){
            int index = word.charAt(i) - 'a';
            if(curr.children[index] == null){
                curr.children[index] = new node();
            }
            curr = curr.children[index];
        }
        curr.eow = true;
    }

    // with for loop 
    public static boolean start_with(String word){
        node curr = root;
        for(int i = 0 ; i<word.length() ;i++){
            int index = word.charAt(i) - 'a';
            if(curr.children[index] == null){
                return false;
            }
            curr = curr.children[index];
        }
        return true;
    }

    // with recution
    public static boolean start( node root ,String word){
        if(word.length() == 0){
            return true;
        }
        if(root.children[word.charAt(0) - 'a'] == null){
            return false;
        }
        if(start(root.children[word.charAt(0) - 'a'], word.substring(1))){
            return true;
        }
            return false;        
    }

    public static void main(String arg[]){
        String word[] = {"apple" , "app" , "mango" , "man" ,"women"};
        for(int i = 0 ; i<word.length ; i++){
            insert(word[i]);
        }
        System.out.println(start(root, "wom"));
    }
}
