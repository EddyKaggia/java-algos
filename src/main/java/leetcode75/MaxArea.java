package leetcode75;

public class MaxArea {
    public int maxArea(int[] height) {
        int max = 0, left = 0, right = height.length - 1, area;

        while (left < right) {
            if (height[right] < height[left]) {
                area = (right - left) * height[right];
                right--;
            } else {
                area = (right - left) * height[left];
                left--;
            }
            max = Math.max(area, max);
        }

        return max;
    }
}
