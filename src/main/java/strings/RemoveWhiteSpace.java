package strings;

public class RemoveWhiteSpace {
    public static String noWhiteSpace(String inputStr) {
        String outputStr = "";

        for (int i = 0; i < inputStr.length(); i++) {
            char currentChar = inputStr.charAt(i);
            if (currentChar != ' ') {
                outputStr += currentChar;
            }
        }

        return outputStr;
    }

    public static void main(String [] args) {
        System.out.println(noWhiteSpace("   cows eat grass  "));
        System.out.println(noWhiteSpace("   p r   e  s     i      d       e  "));
        System.out.println(noWhiteSpace("      bo     dies"));
    }
}
