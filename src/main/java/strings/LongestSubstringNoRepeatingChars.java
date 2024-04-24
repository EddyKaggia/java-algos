package strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringNoRepeatingChars {
    public static void main(String[] args) {
        String input = "abcabcbb"; // Example input string
        int result = lengthOfLongestSubstring(input);
        System.out.println
                ("Length of the longest substring without repeating characters: " + result); // 3

        System.out.println();

        int result2 = lengthOfLongestSubstring2(input);
        System.out.println
                ("Length of the longest substring without repeating characters: " + result2); // 3
    }

    // NON-OPTIMAL solution
    public static int lengthOfLongestSubstring( String s) {
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            // StringBuilder creates a new string object
            StringBuilder currentSubstring = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                if (currentSubstring.indexOf(String.valueOf(s.charAt(j))) != -1) {
                    break;
                }
                currentSubstring.append(s.charAt(j));
                maxLength = Math.max(maxLength, currentSubstring.length());
            }
        }

        return maxLength;
    }

    // OPTIMAL Solution
    public static int lengthOfLongestSubstring2( String s) {
        int maxLength = 0;

        Map<Character, Integer> visitedCharacters= new HashMap<>();

        for (int right = 0, left = 0; right < s.length(); right++) {
            char currentCharacter = s.charAt(right);

            if (visitedCharacters.containsKey(currentCharacter)
                    && visitedCharacters.get(currentCharacter) >= left) {
                left = visitedCharacters.get(currentCharacter) + 1;
            }

            maxLength = Math.max(maxLength, right - left + 1);
            visitedCharacters.put(currentCharacter, right);
        }

        return maxLength;
    };
}
