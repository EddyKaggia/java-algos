package strings;

public class CountSpaces {
    public static int countSpace(String inputStr) {
        int count = 0;
        for (int i = 0; i < inputStr.length(); i++) {
            if (inputStr.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSpace("You're super close!"));
        System.out.println(countSpace("close"));
        System.out.println(countSpace("The issue is that you're comparing"));
    }
}
