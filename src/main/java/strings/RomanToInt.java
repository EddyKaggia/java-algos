package strings;

import java.util.*;

public class RomanToInt {
    public static int roman(String s) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int value = roman.get(s.charAt(i));

            if (i < s.length() - 1 && value < roman.get(s.charAt(i + 1))) {
                sum -= value;
            } else {
                sum += value;
            }
        }
        return sum;
    }

    public static void main(String [] args) {
        System.out.println(roman("III"));
        System.out.println(roman("LVIII"));
        System.out.println(roman("MCMXCIV"));
    }
}
