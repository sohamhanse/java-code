package oops;

public class interfacing {
    public static void main(String arg[]) {
        king k = new king();
        k.move();
    }
}

interface chess {
    void move(); // here we just discribe the property means crete an interface & it is public and whole class is 100 % abstract  
}

class king implements chess {
    public void move() {
        System.out.println("one step in every direction (forward, backward, up, down, diagonally)");
    }
}

class pown implements chess {
    public void move() {
        System.out.println(
                "It may move one vacant square directly forward, it may move two vacant squares directly forward on its first move, and it may capture one square diagonally forward.");
    }
}
