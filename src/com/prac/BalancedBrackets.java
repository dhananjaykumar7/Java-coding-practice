package com.prac;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {

    static boolean isBalanced(String expr){

        Deque<Character> stack= new ArrayDeque<>();

        for (int i=0; i<expr.length();i++) {
            char x = expr.charAt(i);
            if(x=='(' || x=='[' || x=='{'){
                stack.push(x);
                continue;
            }
            if(stack.isEmpty())
                break;
            char check;
            switch (x){
                case ')':
                    check =stack.pop();
                    if(check =='{' || check =='[')
                        return false;
                    break;

                case '}':
                    check =stack.pop();
                    if(check =='(' || check =='[')
                        return false;
                    break;
                case ']':
                    check =stack.pop();
                    if(check =='(' || check =='{')
                        return false;
                    break;
            }
        }
// Check Empty Stack
        return (stack.isEmpty());
    }

    public static void main(String[] args) {
        String expr = "{([{}])}";

        // Function call
        if (isBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}
