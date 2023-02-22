package Controller;

import Model.IStack;
import Model.StackUsingArrayList;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class InfixInterpreter{
        public String infixToPostfix(String infixString) {
                StringBuilder postfix = new StringBuilder();
                Deque<Character> stack = new ArrayDeque<>();

                for (int i = 0; i < infixString.length(); i++) {
                        char c = infixString.charAt(i);
                        if (Character.isLetterOrDigit(c)) {
                                postfix.append(c);
                        } else if (c == '(') {
                                stack.push(c);
                        } else if (isOperator(c)) {
                                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
                                        postfix.append(stack.pop());
                                }
                                stack.push(c);
                        } else if (c == ')') {
                                while (!stack.isEmpty() && stack.peek() != '(') {
                                        postfix.append(stack.pop());
                                }
                                if (!stack.isEmpty() && stack.peek() == '(') {
                                        stack.pop();
                                }
                        }
                }
                while (!stack.isEmpty()) {
                        postfix.append(stack.pop());
                }
                return postfix.toString();
        }

        private boolean isOperator(char c) {
                return c == '+' || c == '-' || c == '*' || c == '/';
        }

        private int precedence(char operator) {
                if (operator == '*' || operator == '/') {
                        return 2;
                } else if (operator == '+' || operator == '-') {
                        return 1;
                } else {
                        return 0;
                }
        }
}
