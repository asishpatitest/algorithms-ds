package algorithms;

import java.util.Stack;

/*
 * Check if there is any redundant parenthesis in an expression
 * in O(n) time.
 */
public class RedundantParenthesisChecker {

    private static boolean checkRedundancy(String str) {
        Stack<Character> stack = new Stack<>();
        char[] strChar = str.toCharArray();

        for (char character : strChar) {
            if (character == ')') {
                char top = stack.pop();
                boolean flag = true;

                while (top != '(') {
                    if (top == '+' || top == '-' || top == '*' || top == '/') {
                        flag = false;
                    }

                    top = stack.pop();
                }
                if (flag) {
                    return true;
                }
            } else {
                stack.push(character);
            }
        }
        return false;
    }

    private static void findRedundant(String str) {
        boolean ans = checkRedundancy(str);
        if (ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        String str = "((a+b))";
        findRedundant(str);

        str = "(a+(b)/c)";
        findRedundant(str);

        str = "(a+b*(c-d))";
        findRedundant(str);
    }
}
