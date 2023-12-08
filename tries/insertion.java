package tries;

public class insertion {
    static class node{
        node childeren [] = new node[26];  //  here we take 26 because we are inserting string 
        boolean eow;
        node(){
            eow = false;
            for(int i = 0 ; i<childeren.length ; i++){
                childeren[i] = null;
            }
        }

    }

    public static node root = new node();

    public static void insert(String word){
        node curr = root;
        for(int i = 0 ; i< word.length() ;i++){
            int index = word.charAt(i) - 'a';
            if(root.childeren[index] == null){
                curr.childeren[index] = new node();   
            }
            curr = curr.childeren[index];
        }
        curr.eow = true;
    }


    public static void main(String arg[]){
        String word[] = {"the" ,"there" ,"their" ,"any" ,"a" ,"thee"};
        for(int i = 0 ; i<word.length ; i++){
            insert(word[i]);
        }
    }
}
