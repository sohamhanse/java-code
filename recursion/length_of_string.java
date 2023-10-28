package recursion;

public class length_of_string {
    public static int length(String str){
        if(str.equals("")){
            return 0;
        }
        else{
            return length(str.substring(1))+1;
        }
        
    }

    public static void main(String arg[]){
        System.out.println(length("soham"));
        // using this consept code run you will get it 
        // String n = "kkr";
        // System.out.println(n.substring(1));
    }
}
