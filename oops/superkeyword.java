package oops;

public class superkeyword {
    public static void main(String arg[]){
          elephant e1 = new elephant();
          System.out.println(e1.color);
    }
   
    
}
class animal3 {
   
    String color;
}

class elephant extends animal3{

     elephant() {
        super.color="black";
    }
     static{
        System.out.println("hii");
    }
}
