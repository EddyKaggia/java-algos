package leetcode75;

public class MaxProduct {
    public static int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], result = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < 0) {
                int temp = max;
                max = min;
                min = max;
            }

            max = Math.max(max * nums[i], nums[i]);
            min = Math.min(min * nums[i], nums[i]);
            result = Math.max(result, max);
        }

        return result;
    }

    public static void main (String[] args) {
        System.out.println(maxProduct(new int[] {2,3,-2,4}));
        System.out.println(maxProduct(new int[] {-2,0,-1}));
    }
}
