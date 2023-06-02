package com.practice;

public class Calculator {
    public void calc(int a, int b, char c) {
        switch(c) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
            case '/':
                checkZero(a, b);
                System.out.println(a/b);
            case '%':
                checkZero(a,b);
                System.out.println(a%b);
            default:
                throw new RuntimeException();
        }
    }

    public static void checkZero(int a, int b) {
        if(a ==0 || b ==0){
            throw new ArithmeticException();
        }
    }
}
