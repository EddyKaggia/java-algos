package strings;

public class Compare {
    public static Boolean compareString(String str1, String str2) {
        return str1.length() == str2.length();
    }

    public static void main(String[] args) {
        System.out.println(compareString("AB", "CD"));
        System.out.println(compareString("ABC", "DE"));
        System.out.println(compareString("hello", "edabit"));
    }
}
