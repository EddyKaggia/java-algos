package com.arrays;

public class BubbleSort {
    int[] bubbleArr = {5, 1, 4, 2, 8};
for (int i = 0; i < bubbleArr.length - 1; i++) {
    for (int j = 0; j < bubbleArr.length - 1 - i; j++) {
        if (bubbleArr[j] > bubbleArr[j + 1]) {
            int temp = bubbleArr[j];
            bubbleArr[j] = bubbleArr[j + 1];
            bubbleArr[j + 1] = temp;
        }
    }
}
System.out.println(Arrays.toString(bubbleArr));

}
