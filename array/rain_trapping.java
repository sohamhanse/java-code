package array;

public class rain_trapping {
    public static int rain_trapped(int height[]) {
        int rain_trap=0;
        int n  = height.length;
        int left_max[] = new int [height.length];
        left_max[0]=height[0];
        for(int i = 1;i < height.length ;i++)
        {
            left_max[i]=Math.max(left_max[i-1], height[i]);
        }

        int right_max[] = new int [height.length];
        right_max[n-1]=height[n-1];
        for(int j = n-2;j>=0;j--)
        {
            right_max[j]=Math.max(right_max[j+1], height[j]);
        }

        for(int k=0;k<height.length;k++)
        {
            rain_trap += Math.min(left_max[k], right_max[k]) - height[k];
        }

        return rain_trap;
    }

    public static void main(String arg[]) {
       int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
       System.out.println(rain_trapped(height));
    }
}
