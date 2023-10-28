package backtracking;

public class find_subset {
    public static void substring(String str, String ans , int n){
        if(n == str.length()){
           if(ans.length() == 0) {
            System.out.println("null");
           }
           else{
            System.out.println(ans);
           }
           return ;
        }

        substring(str, ans+str.charAt(n), n+1); 
        substring(str, ans, n+1);               // backtracting line (if char say not to join substring)


    }
    public static void main(String arg[]){
        substring("abc", "", 0);
    }
}
