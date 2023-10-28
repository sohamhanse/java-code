package backtracking;

public class permitation {
    public static void perm(String str, String ans ){
        if(str.length() == 0 ){
            System.out.println(ans);
           return ;
        }

        for(int i = 0 ; i<str.length() ; i++){
            String newstr = str.substring(0,i) +str.substring(i+1);
            perm(newstr,ans+str.charAt(i));
        }

    }
    public static void main(String arg[]){
        perm("abc", "");

    }
}

