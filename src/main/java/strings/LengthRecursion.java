package strings;

public class LengthRecursion {
    public static int stringLength(String inputStr) {
        // Base Case
        if (inputStr.equals("")) return 0;

        //Recursive cCase
        return 1 + stringLength(inputStr.substring(1));
    }

    public static void main(String[] args) {
        System.out.println(stringLength("apple"));
        System.out.println(stringLength("make"));
        System.out.println(stringLength("a"));
        System.out.println(stringLength(""));
    }
}
