package stack;

import java.util.Stack;

public class largest_rectangle_in_histogram {
    public static int largestRectangleArea(int [] heights) {
        Stack<Integer> left = new Stack<>();
        int left1[] = new int[heights.length];
        int right1[] = new int[heights.length];
        Stack<Integer> right = new Stack<>();
        for(int i = 0 ; i < heights.length ; i++){
            while(!left.isEmpty() && heights[left.peek()] >= heights[i]){
                left.pop();
            }
            if(left.isEmpty()){
                left1[i] = -1;
            }else{
                left1[i] = left.peek();
            }
            left.push(i);
        }
        for(int i = heights.length-1 ; i >= 0 ; i--){
            while(!right.isEmpty() && heights[right.peek()] >= heights[i]){
                right.pop();
            }
            if(right.isEmpty()){
                right1[i] = heights.length;
            }else{
                right1[i] = right.peek();
            }
            right.push(i);
        }

        int width[] = new int[heights.length];
        int area[] = new int[heights.length];
         int max = 0;
        for(int i = 0; i<width.length ; i++){
            width[i] = right1[i]-left1[i]-1; 
             area[i] = heights[i] * width[i] ;
             if(area[i]>max){
                 max = area[i];
            } 
        }
        return max;
    }
    public static void main(String arg[]){
        int arr[] = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(arr));
    }
}
