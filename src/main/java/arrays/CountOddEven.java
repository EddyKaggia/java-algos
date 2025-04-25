package arrays;

import java.util.Arrays;

public class CountOddEven {
    public static int[] countNum(int[] inputNum) {
        int[] output = new int[2];

        for (int i = 0; i < inputNum.length; i++) {
            if (inputNum[i]%2 == 0) {
                output[0]++;
            } else {
                output[1]++;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countNum(new int[]{1, 2, 3, 4, 5, 6}))); // [3, 3]
        System.out.println(Arrays.toString(countNum(new int[]{1,2,3,4,5}))); // [1, 2]
    }
  
}
