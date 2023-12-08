package tries;

public class searchintries {
    static class node{
        node child[] = new node[26];
        boolean eow = false;
        node(){
            for(int i = 0 ; i< child.length; i++){
                child [i] = null;
            }
        }
    }

    public static node root = new node();

    static void insert(String word){
        node curr = root;
        for(int i = 0; i < word.length() ; i++){
            int index = word.charAt(i) - 'a' ;
            if(curr.child[index] == null){
                curr.child[index] = new node();
            }
            curr = curr.child[index];
        }
        curr.eow  = true;
    }

    static boolean search(String word){
        node curr = root;
        for(int i = 0; i < word.length() ; i++){
            int index = word.charAt(i) - 'a' ;
            if(curr.child[index] == null){
                return false;
            }
            curr = curr.child[index];
        }
        return true;
    }

    public static void main(String arg[]){
        String word[] = {"the" ,"there" ,"their" ,"any" ,"a" ,"thee"};
        for(int i = 0 ; i<word.length ; i++){
            insert(word[i]);
        }
        System.out.println(search("thor"));
    }

}
