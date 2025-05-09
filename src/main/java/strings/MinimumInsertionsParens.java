package strings;

public class MinimumInsertionsParens {
    public static int minInsertion(String s) {
        int res = 0;
        int rightNeeded = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                if (rightNeeded % 2 != 0) {
                    res++;
                    rightNeeded--;
                }
                rightNeeded += 2;
            } else {
                rightNeeded--;
                if(rightNeeded < 0) {
                    res++;
                    rightNeeded = 1;
                }
            }
        }

        return res + rightNeeded;
    }

    public static void main(String [] args) {
        System.out.println(minInsertion( "(()))"));
        System.out.println(minInsertion("())"));
        System.out.println(minInsertion("))())("));
    }
}
