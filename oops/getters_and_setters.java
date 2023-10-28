package oops;

public class getters_and_setters {
    public static void main (String arg[]) {
        pen1 p1 = new pen1();
        p1.setcolour("black");
        System.out.println(p1.getcolour());
    }

}

class pen1 {

    private String colour;

    String getcolour() {
        return colour;
    }

    void setcolour(String colour) {
        this.colour = colour;

    }

}

