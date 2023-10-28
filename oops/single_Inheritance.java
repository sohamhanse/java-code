package oops;
public class single_Inheritance {
    public static void main (String arg[]){
        Fish shark = new Fish();
        shark.colour("blue"); // see colour not present in fish still but it inherits the animal so property of animal also present in fish.
    }
}
class animal{
    String colour;
    void colour(String colour){
        System.out.println(colour);
    }
    void eat(){
        System.out.println("eats");
    }
     void breath(){
        System.out.println("breaths");
    }

}
class Fish extends animal{
    int fing;
    void fing (int fing){
        System.out.println(fing);
    }
}
