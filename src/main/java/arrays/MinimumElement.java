package arrays;

public class MinimumElement {
    public static int minElem(int[] inputArr) {
        int min = inputArr[0];

        for(int i = 0; i < inputArr.length; i++) {
            if(min > inputArr[i]) {
                min = inputArr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        System.out.println(minElem(new int[]{4, 7, 2, 9, 1})); // 1
        System.out.println(minElem(new int[]{100, 21, 30, 5, 10})); // 5
        System.out.println(minElem(new int[]{-5, -9, -2, -10})); // -10
    }
}
