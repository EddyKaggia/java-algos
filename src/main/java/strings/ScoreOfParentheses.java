package strings;

import java.util.*;

public class ScoreOfParentheses {
    public static int score(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (char c: s.toCharArray()) {
            if (c == '(') {
                stack.push(0);
            } else {
                int v = stack.pop();
                int top = stack.pop();
                stack.push(top + Math.max(2 * v, 1));
            }
        }
        return stack.pop();
    }

    public static void main (String [] args) {
        System.out.println(score("()"));
        System.out.println(score("(())"));
        System.out.println(score("()()"));
    }
}