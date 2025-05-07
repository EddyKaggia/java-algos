package arrays;

import java.util.*;

public class LargestRectangle {
    public static int largestRectangle(int [] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int currentHeight = (i == n) ? 0 : heights[i];

            while(!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                int topIndex = stack.pop();
                int height = heights[topIndex];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }

    public static void main(String [] args) {
        System.out.println(largestRectangle(new int[] {7,1,7,2,2,4}));
        System.out.println(largestRectangle(new int[] {1,3,7}));
    }
}
