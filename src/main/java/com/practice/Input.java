package com.practice;

import java.util.Scanner;

public class Input {
    public void inPutData(){
        Calculator calc = new Calculator();
        Scanner in = new Scanner(System.in);

        System.out.print("첫번째 정수 : ");
        int a = in.nextInt();

        System.out.print("두번째 정수 : ");
        int b = in.nextInt();

        System.out.print("사칙연산 입력(+,-,*,/,%) : ");
        char c = in.next().charAt(0);

        calc.calc(a, b, c);
    }
}
