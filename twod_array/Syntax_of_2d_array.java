package twod_array;

import java.util.*;

public class Syntax_of_2d_array {
  public static void small_large_from_array(int matrix[][], int m, int n) {
    int small = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        small = Math.min(matrix[i][j], small);
        max = Math.max(matrix[i][j], max);
      }
    }
    System.out.println("Small Amoung Of Matrix   :- "+small);
    System.out.println("Maximum Amoung Of Matrix :-"+max);
  }

  public static boolean search(int matrix[][],int key) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if(matrix[i][j] == key)
        {
          System.out.println("Found At Position ("+ i + "," + j + ")");
          return true;
        }
      }
    }
    System.out.println("number not found");
    return false;
  }

  public static void main(String arg[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number Of Row    :- ");
    int n = sc.nextInt();
    System.out.print("Enter Number Of Coloum :- ");
    int m = sc.nextInt();
    int matrix[][] = new int[n][m];
    System.out.println("Enter Number :-");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(matrix[i][j] + " ");
      }

      System.out.println();
    }
    small_large_from_array(matrix, m, n);
    search(matrix, 5);

    sc.close();

  }
}
