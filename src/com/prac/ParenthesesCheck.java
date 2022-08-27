package com.prac;

public class ParenthesesCheck {
    public static boolean isBalanced(String s) {
        boolean flag = true;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                count++;
            } else {
                // It is a closing parenthesis
                count--;
            }
            if(count <0){
                // This means there are
                // more Closing parenthesis
                // than opening ones
                flag = false;
                break;
            }
        }
        if(count !=0){
            flag= true;
        }
        return flag;
    }

    public static void main(String[] args) {
        String exp="(())";
        if (isBalanced(exp))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");

        String exp2 = "())((())";

        if (isBalanced(exp2))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");

    }
}
