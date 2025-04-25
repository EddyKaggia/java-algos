package arrays;

import java.util.Arrays;

public class RemoveFromArray {
    public static int[] remove(int[] numArr, int num) {
        int[] output = new int[numArr.length - 1];
        int index = 0;

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] != num) {
                output[index] = numArr[i];
                index++;
            }
           
        }

        return output;
    }

 public static void main(String [] args) {
     System.out.println(Arrays.toString(remove(new int[]{2,4,1,9,200}, 9)));
     System.out.println(Arrays.toString(remove(new int[]{81,24,11,109,210}, 81)));
     System.out.println(Arrays.toString(remove(new int[]{21,4,199,91,1200}, 1200)));
 }
}
