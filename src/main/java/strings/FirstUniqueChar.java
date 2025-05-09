package strings;

public class FirstUniqueChar {
    public static int unique(String s) {
        int[] freq = new int[26];

        for (int i = 0; i <= s.length() - 1; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String [] args) {
        System.out.println(unique("leetcode"));
        System.out.println(unique("loveleetcode"));
        System.out.println(unique("aabb"));
    }
}
