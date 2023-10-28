package oops;

public class oops_basic {
    public static void main(String arg[]) {
        pen p1 = new pen();  // here we declare are object
        System.out.println(p1.colour("black")); // here we use an object by its short name "p1.and fuction name in second class"
        System.out.println(p1.tip(3));
    }
}

class pen{                 // here we declare an second class 
    int tip;
    String colour;
     String colour(String colour){
        this.colour = colour;     // this keyword represt to real object paramete which is present at line 13 if words are same then we use this keyword
        return colour;            // same for line present at 22 

    }

     int tip(int tip){
        this.tip = tip;
        return tip;
    }
    
}
