package Heaps_priority_queue;

import java.util.*;

public class path_with_minimum_effort {
    static class info {
        int x;
        int y;

        info(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static boolean idinside(int x, int y, int arr[][]) {
        return x < arr.length && y < arr[0].length && x >= 0 && y >= 0;
    }

    public static boolean isvisited(int x, int y, int vis[][]) {
        return vis[x][y] == 0;
    }

    public static info smallest(int arr[][], int x, int y, int vis[][]) {
        int min = arr[x][y];
        info small = new info(x, y);
        if (idinside(x + 1, y, arr) && min > arr[x + 1][y] && isvisited(x + 1, y, vis)) {
            min = arr[x + 1][y];
            small.x = x + 1;
            small.y = y;
            vis[x + 1][y] = 1;
        }
        if (idinside(x, y + 1, arr) && min > arr[x][y + 1] && isvisited(x, y + 1, vis)) {
            min = arr[x][y + 1];
            small.x = x;
            small.y = y + 1;
            vis[x][y + 1] = 1;
        }
        if (idinside(x - 1, y, arr) && min > arr[x - 1][y] && isvisited(x - 1, y, vis)) {
            min = arr[x - 1][y];
            small.x = x - 1;
            small.y = y;
            vis[x - 1][y] = 1;
        }
        if (idinside(x, y - 1, arr) && min > arr[x][y - 1] && isvisited(x, y - 1, vis)) {
            min = arr[x][y - 1];
            small.x = x;
            small.y = y - 1;
            vis[x][y - 1] = 1;
        }
        return small;
    }

    public static Stack<info> point(int arr[][]) {
        int i = 0;
        int j = 0;
        Stack<info> s = new Stack<>();
        s.add(new info(0, 0));
        int vis[][] = new int[arr.length][arr[0].length];
        vis[0][0] = 1;
        while (i != arr.length && j != arr[0].length) {
            int x = s.peek().x;
            int y = s.peek().y;
            info small = smallest(arr, x, y, vis);
            s.push(small);
            i = s.peek().x;
            j = s.peek().y;
        }
        return s;
    }

    public static int sum(Stack<info> s, int arr[][]) {
        int sum = 0;
        while (!s.isEmpty()) {
            sum += arr[s.peek().x][s.peek().y];
            s.pop();
        }
        return sum;
    }

    public static void main(String arg[]) {
        int[][] grid = { { 31, 100, 65, 12, 18 },
                { 10, 13, 47, 157, 6 },
                { 100, 113, 174, 11, 33 },
                { 88, 124, 41, 20, 140 },
                { 99, 32, 111, 41, 20 } };

        System.out.println(sum(point(grid), grid));

    }

}
