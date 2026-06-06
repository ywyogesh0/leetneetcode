package com.ibm;

import java.util.Map;
import java.util.Stack;

/**
 * Problem 16: Valid Parentheses
 *
 * Input: a string `s` containing parentheses characters '()[]{}'.
 * Output: boolean indicating whether the input is valid (properly closed and nested).
 * Example: "()[]{}" -> true, "([)]" -> false
 *
 * Approach: use a stack to match closing brackets with the most recent opening bracket.
 *
 * Visual Illustration (s="({[]})"):
 * 1) push '(' then '{' then '[' onto stack
 * 2) encounter ']' -> matches top '[' -> pop
 * 3) continue matching '}' and ')' -> stack empty -> valid
 */
public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = Map.of(')', '(', '}', '{', ']', '[');
        for (char c : s.toCharArray()) {
            if ("({[".indexOf(c) >= 0) stack.push(c);
            else {
                if (stack.isEmpty() || stack.pop() != map.get(c)) return false;
            }
        }
        return stack.isEmpty();
    }
}
