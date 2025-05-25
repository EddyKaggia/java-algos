package leetcode75;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = map.get(nums[i]);
            if (complementIndex != null) {
                return new int[]{i, complementIndex};
            }
            map.put(target - nums[i], i);
        }
        return nums;
    }
}
