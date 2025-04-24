package strings;

public class Palindrome2 {
    public static Boolean isPalindrome(String inputStr) {
        String outputStr = "";

        for (int i = inputStr.length() - 1; i>= 0; i--) {
            outputStr += inputStr.charAt(i);
        }

        return outputStr.equals(inputStr);
    }

    public static void main(String [] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("murdrum"));
        System.out.println(isPalindrome("dune"));
    }
}
