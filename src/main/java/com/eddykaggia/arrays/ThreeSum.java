package com.eddykaggia.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {};
        int[] nums2 = {};
        int[] nums3 = {};

        System.out.println(threeSum(nums));
        System.out.println(threeSum(nums2));
        System.out.println(threeSum(nums3));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        // Loop through the input array, nums.length - 2 to ensure that we have a triplet
        for (int i = 0; i < nums.length - 2; i++) {
            if(i == 0 || (i > 0 && nums[i] != nums[i - 1])) {

            }
        }
        return result;
    }
}
