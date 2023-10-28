package basic_code;
import java.util.*;
public class calculator {
    public static void main(String arg [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("select operator (+,-,*,/,%)");
        char ch = sc.next().charAt(0);
        System.out.println("value of a :- ");
        int a = sc.nextInt();   
        System.out.println("value of b :- ");
        int b = sc.nextInt();  

        switch (ch) {
            case '+':
                System.out.println("value of a+b :- " + a+b);
                break; 
                
            case '-':
                System.out.println(a-b);
                break;   
                
            case '%':
                System.out.println("value of a%b :- " + a%b);
                break;
            case '/':
                System.out.println("value of a/b :- " + a/b);
                break;
            case '*':
                System.out.println("value of a*b :- " + a*b);
                break;
            default:
                System.out.println("you have not choose correct operator");
                break;
        }
        sc.close();

    }


}
