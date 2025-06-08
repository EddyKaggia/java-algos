package leetcode75;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> unique = new HashSet<Integer>();

        for (int num : nums) {
            if (unique.contains(num)) {
                return true;
            }
            unique.add(num);
        }
        return false;
    }
}
