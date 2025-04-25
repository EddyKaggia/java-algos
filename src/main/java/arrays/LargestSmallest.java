package arrays;

import java.util.Arrays;

public class LargestSmallest {
    public static int[] largestSmallest(int[] num) {
       int[] output = {num[0], num[1]};

       for (int i : num) {
        if (i > output[0]) output[0] = i;
        if (i < output[1]) output[0] = i;
       }

       return output;
    }

    public static void main(String [] args) {
        System.out.println(Arrays.toString(largestSmallest(new int[]{2,4,1,9,200})));
        System.out.println(Arrays.toString(largestSmallest(new int[]{81,24,11,109,210})));
        System.out.println(Arrays.toString(largestSmallest(new int[]{21,4,199,91,1200})));
    }
}
