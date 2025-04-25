package arrays;

public class SecondLargest {
    public static int secondLarge(int[] numArr) {
        if(numArr.length < 2) System.out.println("Too few elements");
        int largest = 0;
        int second = 0;

        if (numArr[0] > numArr[1]) {
            largest = numArr[0];
            second = numArr[1];
        } else {
            largest = numArr[1];
            second = numArr[0];
        }

        for (int i = 2; i < numArr.length; i++) {
            if (numArr[i] > largest) {
                second = largest;
               largest = numArr[i];
            } else if (numArr[i] > second && numArr[i] != largest) {

            }
           
        }

        return second;
    }

 public static void main(String [] args) {
     System.out.println(secondLarge(new int[]{2,4,1,9,200})); // 9
     System.out.println(secondLarge(new int[]{81,24,11,109,210})); // 109
     System.out.println(secondLarge(new int[]{21,4,199,91,1200})); // 199
 }
}
