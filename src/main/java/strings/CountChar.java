package strings;

public class CountChar {
    public static int countChar(String inputStr) {
        int i = 0;

        while (i < inputStr.length()) {
            i++;
        }

        return i;
    }

    public static void main(String[] args) {
        System.out.println(countChar("wow")); // 3
        System.out.println(countChar("bread")); // 5
        System.out.println(countChar("ice cream")); // 9
    }
}
