package com;

import java.util.Arrays;

public class RearrangeByParity {
    public static int[] rearrangeParity(int[] inputArr) {
        int[] output = new int[inputArr.length];
        int j = 0;

        for(int i = 0; i < inputArr.length; i++) {
            if(inputArr[i]%2 == 0) {
               output[j] = (inputArr[i]);
               j++;
            }
        }

        for(int k = 0; k < inputArr.length; k++) {
            if(inputArr[k]%2 != 0) {
               output[j] = (inputArr[k]);
               j++;
            }
        }

        return output;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrangeParity(new int[]{3,1,2,4})));
    }
}
