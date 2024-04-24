package strings;

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

    // Non-optimal solution
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

    // Optimal Solution
    public static int lengthOfLongestSubstring2( String s) {
        int maxLength = 0;

        return maxLength;
    };
}
