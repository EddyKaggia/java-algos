package com.arrays;

public class RotateByK {
    int[] rotateArr = {1, 2, 3, 4, 5};
int k = 2;
int n = rotateArr.length;
int[] rotated = new int[n];
for (int m = 0; m < n; m++) {
    rotated[(m + k) % n] = rotateArr[m];
}
System.out.println(Arrays.toString(rotated));

}
