package oops;

public class method_overriding {
    public static void main(String arg[]) {
        // here "eats grass" will print because we call object of deer class so that
        // eat() fuction will exicute.

        // deer d = new deer();
        // d.eat();

        // here "eats grass" will print because we call object of animal class so that
        // eat() fuction will exicute.

        animal a = new animal();
        a.eat();
    }
}

class animal {
    void eat() {
        System.out.println("eats");
    }
}

class deer extends animal {
    void eat() {
        System.out.println("eats grass");
    }
}
