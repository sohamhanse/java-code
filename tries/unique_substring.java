package tries;

public class unique_substring {
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
    public static int count = 0 ;
    public static node root = new node();

    public static void insert(String word){
        node curr = root;
        for(int i = 0 ; i< word.length() ;i++){
            int index = word.charAt(i) - 'a';
            if(curr.childeren[index] == null){
                curr.childeren[index] = new node(); 
                count++;  
            }
            curr = curr.childeren[index];
        }
        curr.eow = true;
    }
    

    public static void main(String arg[]){
        String word = "cac";
        for(int i = 0 ; i<word.length() ; i++){
            String suffix = word.substring(i);
            insert(suffix);
        }
        
        System.out.println(count+1); // plus 1 because "" is also substring
    }
}
