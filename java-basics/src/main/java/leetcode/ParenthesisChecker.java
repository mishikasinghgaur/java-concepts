package leetcode;

import java.util.Stack;

public class ParenthesisChecker {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch); // Push open brackets onto the stack
            } else {
                if (stack.isEmpty()) {
                    return false; // There is no matching open bracket
                }

                char top = stack.pop();
                if (ch == ')' && top != '(') {
                    return false;
                }
                if (ch == '}' && top != '{') {
                    return false;
                }
                if (ch == ']' && top != '[') {
                    return false;
                }
            }
        }

        return stack.isEmpty(); // The stack should be empty at the end for a valid string.
    }

    public static void main (String[] args) {
        String input1 = "([{}])";
        boolean isValid1 = isValid(input1);
        System.out.println(isValid1); // Output: true

        String input2 = "([)]";
        boolean isValid2 = isValid(input2);
        System.out.println(isValid2); // Output: false
    }
}
