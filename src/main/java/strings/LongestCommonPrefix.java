package strings;

public class LongestCommonPrefix {
    public static String longest(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String [] args) {
        System.out.println(longest(new String[] {"flower","flow","flight"}));
        System.out.println(longest(new String[] {"dog","racecar","car"}));
    }
}
