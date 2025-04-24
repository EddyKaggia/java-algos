package strings;

public class Reverse2 {
    public static String reverse(String inputStr) {
        String outputStr = "";

        for (int i = inputStr.length() - 1; i >= 0; i--) {
            outputStr += inputStr.charAt(i);
        }

        return outputStr;
    }

    public static void main(String [] args) {
        System.out.println(reverse("rack"));
        System.out.println(reverse("eulb"));
        System.out.println(reverse("rehcir"));
    }
}
