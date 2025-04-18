package com.eddykaggia.arrays;

public class MaximumElement {
    public static int maxElem(int[] inputArr) {
        int largest = inputArr[0];

        for (int i = 0; i < inputArr.length; i++) {
            if (largest < inputArr[i]) {
                largest = inputArr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        System.out.println(maxElem(new int[]{4, 7, 2, 9, 1})); // 9
        System.out.println(maxElem(new int[]{100, 21, 30, 5, 10})); // 100
        System.out.println(maxElem(new int[]{-5, -9, -2, -10})); // -2
    }
}
