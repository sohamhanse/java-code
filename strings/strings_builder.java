package strings;

public class strings_builder {
    public static void main(String Arg[]) {
        String sb = new String("");
        StringBuilder sc = new StringBuilder("");
        for(char ch = 'a';ch<='z';ch++)
        {
           System.out.println(sb= sb+ch); 
           
        }     
        for(char ch = 'a';ch<='z';ch++)
        {
            sc.append(ch);    
        }   
        System.out.println();
        System.out.println("by string builder :-"+" "+sc);      
    }
}
