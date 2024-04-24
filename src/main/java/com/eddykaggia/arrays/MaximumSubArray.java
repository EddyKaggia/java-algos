package com.eddykaggia.arrays;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums2 = {1};
        int[] nums3 = {5,4,-1,7,8};

        System.out.println(maxSubArray(nums)); // 6
        System.out.println(maxSubArray(nums2)); // 1
        System.out.println(maxSubArray(nums3)); // 23
    }

    // KADANE'S Algorithm
    public static int maxSubArray(int[] nums) {
        int max_sum = nums[0];
        int current_sum = max_sum;

        for (int i = 1; i < nums.length; i++) {
            current_sum = Math.max(nums[i] + current_sum, nums[i]);
            max_sum = Math.max(current_sum, max_sum);
        }

        return max_sum;
    }
}
