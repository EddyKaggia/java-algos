package strings;

public class Rotation {
    public static Boolean rotation(String s, String goal) {
        if (s.length() != goal.length()) return false;

        String doubles = s + s;

        return doubles.contains(goal);
    }

    public static void main(String [] args) {
        System.out.println(rotation("abcde","cdeab"));
        System.out.println(rotation("bcde","abced"));
    }
}
