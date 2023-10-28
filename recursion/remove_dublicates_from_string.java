package recursion;
public class remove_dublicates_from_string {
    public static void remove(int i ,boolean map[] , String st , StringBuilder b){
        if(i == st.length()){
           System.out.println(b);
           return;
        }

        if( map[(st.charAt(i) -'a')] == true ){
            remove(i+1, map, st, b);
        }

        if( map[(st.charAt(i) -'a')] == false ){
           map[st.charAt(i) -'a'] = true ; 
           remove(i+1, map, st, b.append(st.charAt(i)));
        }
    }
    public static void main (String arg[]){
        int i = 0;
        boolean map[]= new boolean[26];
        String str = "sohamhanse";
        StringBuilder b = new StringBuilder("");
        remove(i, map, str, b);
        
    }
}
