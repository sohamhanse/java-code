package oops;
public class multi_level_Inheritance {
    public static void main (String arg[]){
        dog rooky = new dog();
        rooky.colour("black"); 
        rooky.leg (4);
        rooky.breed ("doberman");
    }
}
class animal1{
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
class mammal extends animal1{
    int leg;
    int height;
    void leg (int leg){
        System.out.println(leg);
    }
     void height (int height){
        System.out.println(height);
    }
}
class dog extends mammal{
    String breed;
    void breed (String breed){
        System.out.println(breed);
    }
}