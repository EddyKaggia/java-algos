package com.eddykaggia.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSumOptimized {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);

        // Print the result array
        System.out.println("Result Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println(); // Print a newline for better formatting
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex != null) {
                return new int[]{i, complementIndex};
            }
            complements.put(target - nums[i], i);
        }
        return nums;
    }
}
