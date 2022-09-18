package com.interview;

import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {
        String expr = "[()]{}{[()()]()()}";
        System.out.println(isBalancedString(expr));
    }

    static boolean isBalancedString(String expr) {
        Stack<Character> s = new Stack<>();
        for (int i =0; i<expr.length(); i++) {
            char x = expr.charAt(i);

            if (x == '{' || x == '[' || x == '(') {
                s.push(expr.charAt(i));
                continue;
            }

            if(s.empty())
                return false;
            char check;
            switch (x){
                case ')':
                    check = s.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = s.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = s.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        return  s.isEmpty();

    }
}
