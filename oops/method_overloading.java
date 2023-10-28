package oops;

public class method_overloading {
    public static void main(String arg[]) {
        calculator c1 = new calculator();
        System.out.println(c1.sum(1, 2));
        System.out.println(c1.sum((float) 1.5, (float) 2.5)); // if write number in point so it defaultly set number
                                                              // into double therefore we type cast the number into
                                                              // float
        System.out.println(c1.sum(1, 2, 3));
    }
}

class calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
