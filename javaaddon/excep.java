import java.util.*;

class myexception extends Exception{
    @Override
    public String getMessage(){
        return "exception occured";
    }
}


public class excep {
    public static void main(String arg[]){
        int i = 5;
        try{
            if(i<20){
                throw new myexception();
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
