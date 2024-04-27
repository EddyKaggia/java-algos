package com.eddykaggia.arrays;

public class MinimumRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        int[] nums2 = {4,5,6,7,0,1,2};
        int[] nums3 = {11,13,15,17};

        System.out.println(findMin(nums)); // 1
        System.out.println(findMin(nums2)); // 0
        System.out.println(findMin(nums3)); // 11
    }

    public static int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            if (nums[l] <= nums[r]) {
                return nums[l];
            }

            int mid = (l + r) / 2;
            if (nums[mid] >= nums[l]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return 0;
    }
}
