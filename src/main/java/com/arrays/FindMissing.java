package com.arrays;

public class FindMissing {
    int[] nums = {1, 2, 4, 5};
int n = 5;
int expectedSum = n * (n + 1) / 2;
int actualSum = 0;
for (int num : nums) actualSum += num;
System.out.println("Missing number: " + (expectedSum - actualSum));

}
