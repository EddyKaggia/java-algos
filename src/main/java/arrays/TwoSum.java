package arrays;

public class TwoSum {
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

    public int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}