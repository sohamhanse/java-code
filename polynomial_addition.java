import java.util.*;
class polynomial_addition {
    public static int[] read(int n) {
        Scanner sc = new Scanner(System.in);
        int poly[] = new int[100];
        for (int i = 0; i < n; i++) {
            System.out.print("enter coefficient : - ");
            int coef = sc.nextInt();
            System.out.print("enter exponant : - ");
            int expo = sc.nextInt();
            poly[expo] = poly[expo] + coef;
        }
        return poly;
    }

    public static void print(int poly[]) {
        for (int i = 0; i < 100 ; i++) {
            if (poly[i] != 0) {
                if (poly[i] > 0 && i > 0) {
                    System.out.print("+" + poly[i] + "x^" + i);
                }
                if (poly[i] < 0 && i > 0) {
                    System.out.print(poly[i] + "x^" + i);
                }
                if (poly[i] > 0 && i == 0) {
                    System.out.print("+" + poly[i]);
                }
                if (poly[i] < 0 && i == 0) {
                    System.out.print(poly[i]);
                }
            }
        }
        System.out.println();
    }

    public static int[] add(int poly1[],int poly2[]){
        int polyadd[] = new int[100];
        for(int i = 0 ; i<polyadd.length;i++){
            polyadd[i] = poly1[i] + poly2[i]; 
        }
        return polyadd;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many number do you want to enter in 1st polymomial : - ");
        int i = sc.nextInt();
        int poly1[] = new int[i];
        poly1 = read(i);
        System.out.print("how many number do you want to enter in 2nd polymomial : - ");
        int j = sc.nextInt();
        int poly2[] = new int[j];
        poly2 = read(j);
        System.out.println("First Polynomial :- ");
        print(poly1);
        System.out.println("Second Polynomial :- ");
        print(poly2);
        System.out.println();
        int polyadd[] = add(poly1, poly2);
        System.out.println("adiition of two Polynomial :- ");
        print(polyadd);
    }
}
