package com.arrays;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        int[] nums2 = {-2,0,-1};
        int[] nums3 = {75, 0, 1, 2, 3};

        System.out.println(maxProduct(nums)); // 6
        System.out.println(maxProduct(nums2)); // 0
        System.out.println(maxProduct(nums3)); // 75
    }

    public static int maxProduct(int[] nums) {
        if (nums.length == 1) return nums[0];

        int res = nums[0];
        int max = 1;
        int min = 1;

        for (int n: nums) {
            int tmp = max * n;
            max = Math.max(n, Math.max(tmp, min * n));
            min = Math.min(n, Math.min(tmp, min * n));
            res = Math.max(res, max);
        }

        return res;
    }
}
