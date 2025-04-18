package strings;

public class Reverse {
    //Looping with char[]
    public static String reverseString(String inputStr) {
        // char[] inputArr = new char[inputStr.length()];
        char[] inputArr = inputStr.toCharArray();  
        char[] reversedArr = new char[inputStr.length()];

        for(int i = 0; i < inputArr.length; i++) {
            reversedArr[i] = inputArr[inputArr.length - 1 - i];
        }

        System.out.println(inputArr);

        return new String(reversedArr);
    }

    // Looping solution with method
    public static String reverseString1(String inputStr) {
        String outputStr = "";

        for (int i = inputStr.length() - 1; i >= 0; i--) {
            System.out.println(inputStr.charAt(i));
            outputStr += inputStr.charAt(i);
        }

        return outputStr;
     }

     public static void main(String[] args) {
        System.out.println(reverseString("Lord")); // droL
        System.out.println(reverseString("cow")); // woc
        System.out.println(reverseString("viva")); // aviv
     }
}
