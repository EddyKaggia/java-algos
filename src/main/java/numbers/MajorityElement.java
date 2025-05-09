package numbers;

public class MajorityElement {
    public static int majority(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num: nums) {
            if (count == 0) {
                candidate = num;
            }

            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String [] args) {
        System.out.println(majority(new int[] {3,2,3}));
        System.out.println(majority(new int[] {2,2,1,1,1,2,2}));
    }
}
