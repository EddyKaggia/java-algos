package leetcode75;

public class FindMin {
    public int findMin(int[] nums) {
        if (nums.length == 1) return nums[0];

        int left = 0, right = nums.length - 1;

        if (nums[right] > nums[0]) return nums[0];

        while (right >= left) {
            int mid = left + (right - left)/2;

            if (nums[mid] > nums[mid + 1]) return nums[mid + 1];
            if (nums[mid - 1] < nums[mid]) return nums[mid];

            if (nums[mid] > nums[0]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return - 1;
    }
}
