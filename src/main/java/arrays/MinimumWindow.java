package arrays;

import java.util.*;

public class MinimumWindow {
    public static String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) return "";

        Map<Character, Integer> tCount = new HashMap<>();
        for (char c: t.toCharArray()) {
            tCount.put(c, tCount.getOrDefault(c, 0) + 1);
        }

        int left = 0, minLeft = 0, minLen = Integer.MAX_VALUE, matches = 0;
        Map<Character, Integer> window = new HashMap<>();

        for (int right = 0; right < s.length(); right ++) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (tCount.containsKey(c) && window.get(c).equals(tCount.get(c))) {
                matches++;
            }

            while (matches == tCount.size()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minLeft = left;
                }

                char remove = s.charAt(left);
                window.put(remove, window.get(remove) - 1);

                if (tCount.containsKey(remove) && window.get(remove) < tCount.get(remove)) {
                    matches--;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLen);
    }

    public static void main(String [] args) {
        System.out.println(minWindow("OUZODYXAZV", "XYZ"));
        System.out.println(minWindow("xyz", "xyz"));
        System.out.println(minWindow("x", "xy"));
    }
}
