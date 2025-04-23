package strings;

public class PalindromeProgram {

    public static Boolean isPalindrome(String inputStr) {
        String outputStr = "";

        for (int i = inputStr.length() - 1; i >= 0; i--) {
            outputStr += inputStr.charAt(i);
        }

        return outputStr.equals(inputStr);
    }

    public static void main(String [] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("car"));
        System.out.println(isPalindrome("noon"));
    }
}
