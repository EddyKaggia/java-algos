package arrays;

public class Sum {
    public static int sum(int[] inputArr) {
        int output = 0;

        for (int i = 0; i < inputArr.length; i++) {
            output += inputArr[i];
        }

        return output;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{4, 7, 2, 9, 1})); // 1
        System.out.println(sum(new int[]{100, 21, 30, 5, 10})); // 5
        System.out.println(sum(new int[]{-5, -9, -2, -10})); // -10
    }
}
