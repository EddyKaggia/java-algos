package strings;

public class Palindrome {
    // Lopping solution
    public static Boolean isPalindrome1(String inputStr) {
        char[] inputArr = inputStr.toCharArray();
        char[] reverseArr = new char[inputArr.length];

        for (int i = 0; i < inputArr.length; i++) {
            reverseArr[i] = inputArr[inputArr.length - 1 - i];
        }

        String reversedStr = new String(reverseArr);

        return reversedStr.equals(inputStr);
    }

    // Recursive solution
    public static Boolean isPalindrome(String inputStr) {
        // Base case
        if (inputStr.length() <= 1) return true;
        if (inputStr.charAt(0) != inputStr.charAt(inputStr.length() - 1)) return false;

        // Recursive case
        return isPalindrome(inputStr.substring(1, inputStr.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("radar")); // true
        System.out.println(isPalindrome("racecar")); // true
        System.out.println(isPalindrome("rodar")); // false
    }
}
