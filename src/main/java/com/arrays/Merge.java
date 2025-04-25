package com.arrays;

public class Merge {
    int[] a = {1, 3, 5};
int[] b = {2, 4, 6};
int[] merged = new int[a.length + b.length];
int i = 0, j = 0, k = 0;

while (i < a.length && j < b.length) {
    merged[k++] = a[i] < b[j] ? a[i++] : b[j++];
}
while (i < a.length) merged[k++] = a[i++];
while (j < b.length) merged[k++] = b[j++];

System.out.println(Arrays.toString(merged));

}
