package com.bridgelabz;

import java.util.Stack;

public class BalancedParanthesis {
    public static boolean isClosing(char c) {
        return c == ')' || c == '}' || c == ']';
    }

    public static boolean isOpening(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    public static boolean isMatching(char a, char b) {

        if ((a == '(' && b == ')') || (a == '[' && b == ']') || (a == '{' && b == '}')) {
            return true;
        }
        return false;
    }

    public static boolean isParenthesisMatching(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            if (isOpening(curr)) {
                stack.push(curr);
            /*
            isClosing function gives closing brackets and exclude the numbers which are in the inputs String
            */
            } else if (isClosing(curr)) {
            /*
            if stack is empty in else condition means we peek every element and there is close braces
            still in the stack
            */
                if (stack.empty()) {
                    return false;
                }
            /*

            if current element is matching with the top element or peek element pop the top element which
             is in stack means opening braces if not matching then return false
            */
                else if (isMatching(stack.peek(), curr)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {

        String str = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";

        if (isParenthesisMatching(str)) {
            System.out.println("String has Balanced Paranthesis");
        } else {
            System.out.println("String does not have Balanced Paranthesis");
        }

    }
}
