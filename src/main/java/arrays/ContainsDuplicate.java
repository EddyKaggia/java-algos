package arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int[] nums2 = {1,2,3,4};
        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(containsDuplicate(nums)); // True
        System.out.println(containsDuplicate(nums2)); // False
        System.out.println(containsDuplicate(nums3)); // True
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> numExists = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (numExists.contains(nums[i])) {
                return true;
            }
            numExists.add(nums[i]);
        }
        return false;
    }
}
