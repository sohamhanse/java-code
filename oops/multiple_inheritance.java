package oops;

public class multiple_inheritance {
      public static void main(String arg[]) {
        bear b = new bear();
        b.eat();
    }
}

interface carnivorous {
    void eat();
}

interface herbivorous {
    void eat(); 
}

class bear implements carnivorous,herbivorous{
    public void eat(){
        System.out.println("eats flesh and grass both therefore they are omnivorous");
    }
}
