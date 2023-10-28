package stack;

import java.util.Stack;

public class simplifyPath {

        public static String simplify_Path(String path) {
            Stack<String> stack = new Stack<>();
            StringBuilder sb = new StringBuilder();
            String[] stringsArray = path.trim().split("/");
            for (String s: stringsArray){
                if (s.equals("") || s.equals(".")) continue;
                else if (s.equals("..") && !stack.isEmpty()) stack.pop(); 
                else if (!s.equals("..") && !s.equals(".")) stack.push(s);
                }
            if (stack.isEmpty()) return "/";
            for (String s : stack){
                if (!s.equals("")) sb.append( "/" + s);
            }
        return sb.toString();
        }

    public static void main(String arg[]){
        System.out.println(simplify_Path("/a//b////c/d//././/.."));
    }
}
