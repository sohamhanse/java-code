package tries;

public class prefix_problem {
    static class node{
        node children[] = new node[26];
        boolean eow = false;
        int frequency = 1;

        node(){
            for(int i= 0 ; i< children.length ;i++){
                children[i] = null;
            }
        }
    }

    public static node root =  new node();
    public static void insert(String word){
        node  curr = root;
        for(int i = 0 ; i<word.length() ;i++){
            int index = word.charAt(i) - 'a';
            if(curr.children[index] == null){
                curr.children[index] = new node();
                
            }else{
               curr.children[index].frequency++;  
            }
            curr = curr.children[index];
        }
        curr.eow =true;
    }

    public static String unique(String word){
        node  curr = root;
        String str = "";
        for(int i = 0 ; i<word.length() ;i++){
            int index = word.charAt(i) - 'a';
            if(curr.frequency == 1){
                return str;                
            }else{
                 str+=word.charAt(i);
                 curr = curr.children[index];
            }
        }
        return str;
    }

    public static void uniqueword(node root , String word){
        if(root == null){
            return;
        }

        if(root.frequency == 1){
            System.out.println(word);
            return;
        }
        for(int i = 0 ; i<root.children.length ;i++){
            if(root.children[i] != null){
                uniqueword(root.children[i], word+(char)(i+'a'));     
            }
        }
    }
    public static void main(String arg[]){
        String word[] = {"zebra" , "duck" , "dog" , "dove"};
        for(int i = 0 ; i<word.length ; i++){
            insert(word[i]);
        }
        root.frequency = -1;
        uniqueword(root, "");
        //System.out.println(unique("duck"));
    }
}
