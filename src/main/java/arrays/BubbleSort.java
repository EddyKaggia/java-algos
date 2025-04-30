package arrays;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleAsc(int[] inputArr) {
        for (int i = 0; i < inputArr.length - 1; i++) {
            for (int j = 0; j < inputArr.length - 1 - i; j++) {
                if (inputArr[j] > inputArr[j + 1]) {
                    int temp = inputArr[j];
                    inputArr[j] = inputArr[j + 1];
                    inputArr[j + 1] = temp;
                }
            }
        }


        return inputArr;
    }

    public static int[] bubbleDesc(int[] inputArr) {
        for (int i = 0; i < inputArr.length - 1; i++) {
            for (int j = 0; j < inputArr.length - 1 - i; j++) {
                if (inputArr[j + 1] > inputArr[j]) {
                    int temp = inputArr[j + 1];
                    inputArr[j + 1] = inputArr[j];
                    inputArr[j] = temp;
                }
            }
        }


        return inputArr;
    }

    public static void main (String [] args) {
        System.out.println(Arrays.toString(bubbleAsc(new int[]{1, 3, 5, 23, 9, 16, 11, 19, 2})));
        System.out.println(Arrays.toString(bubbleDesc(new int[]{1, 3, 5, 23, 9, 16, 11, 19, 2})));
    }
}
