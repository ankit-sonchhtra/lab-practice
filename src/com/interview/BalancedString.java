package com.interview;

import java.util.Stack;

public class BalancedString {

    public static void main(String[] args) {
        System.out.println(isBalanced("[()]{}()()]()()}"));
    }

    public static boolean isBalanced(String expr) {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<expr.length();i++){
            char c = expr.charAt(i);
            if(c == '{' || c == '(' || c == '[') {
                s.push(c);
                continue;
            }

            if(s.empty())
                return false;

            char check;
            switch(c){
                case '}':
                    check = s.pop();
                    if(check == ')' || check == ']')
                        return false;
                    break;
                case ')':
                    check = s.pop();
                    if(check == ']' || check == '}')
                        return false;
                    break;
                case ']':
                    check = s.pop();
                    if(check == ')' || check == '}')
                        return false;
                    break;
            }
        }
        return s.isEmpty();
    }
}
