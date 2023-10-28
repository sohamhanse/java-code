package oops;

public class abstracters {
    public static void main(String arg[]) {
        chicken c1 = new chicken();
        System.out.println(c1.colour);
    }
}

abstract class animal2 {
    String colour;

    animal2() {
        colour = "brown"; // question is if we can't use constructor then what is use
        // of constructor the use of constructor is to initialize the variable for child
        // classes which we can implement
        System.out.println("constructor of animal is called");
    }

    void eat() {
        System.out.println("eats");
    }

    abstract void walk(); // here we make a fuction abstract means if you extend the animal class then you have to use the walk fuction compalsory in all .

}

class horse extends animal2 {
    horse() {
        System.out.println("constructor of horse is called");
    }

    void walk() {
        System.out.println("walk on 4 legs");
    }
}

class chicken extends horse {
    chicken() {
        System.out.println("constructor of chicken is called");
    }
}
