package numbers;

import java.util.Arrays;

public class Swap2Nums {
    public static int[] swap(int num1, int num2) {
        int[] output = new int[2];

        num1 += num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        output[0] = num1;
        output[1] = num2;

        return output;
    }

    public static void main(String [] args) {
        System.out.println(Arrays.toString(swap(0, 1)));
        System.out.println(Arrays.toString(swap(4, 2)));
        System.out.println(Arrays.toString(swap(9, 3)));
    }
}
