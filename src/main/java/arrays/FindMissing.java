package arrays;

public class FindMissing {
    public static int missing(int[] inputArr) {
        int n = inputArr.length;

        int actualSum = 0;

        int expectedSum = n * (n + 1)/2;

        for (int num: inputArr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        System.out.println(missing(new int[]{3,0,1}));
        System.out.println(missing(new int[]{0,1}));
        System.out.println(missing(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}
