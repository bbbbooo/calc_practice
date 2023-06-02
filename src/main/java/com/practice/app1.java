package com.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class app1 {
    private boolean con;

    public static void main(String[] args) {
        System.out.println("계산기 시작...");

        app1 app = new app1();

        Scanner in = new Scanner(System.in);
        app.con = true;

        while (app.con) {
             try{
                System.out.print("첫번째 정수 : ");
                int a = in.nextInt();

                System.out.print("두번째 정수 : ");
                int b = in.nextInt();

                System.out.print("사칙연산 입력(+,-,*,/,%) : ");
                char c = in.next().charAt(0);

                app.calc(a, b, c);
                app.con = false; // while문 종료
            }

            catch (InputMismatchException e) {
                System.out.println("------------------------");
                System.out.println("잘못된 값이 입력되었습니다.");
                System.out.println("정수 혹은 사칙연산(+ - * / %)을 정확히 입력해주세요.");
                System.out.println("다시 입력해주세요.");
                System.out.println("------------------------");

                in.nextLine(); // 입력버퍼에 값이 남아있으므로 비워줘야 함. 이 코드가 없으면 위의 문장들이 무한히 반복됨
             }

             catch (ArithmeticException e){
                 System.out.println("------------------------");
                 System.out.println("0으로는 나눌 수 없습니다.");
                 System.out.println("다시 입력해주세요.");
                 System.out.println("------------------------");

                 in.nextLine();
             }
        }

    }

    // 계산 메소드. / 와 %는 둘 중 하나라도 0일 경우 예외처리
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
                throw new InputMismatchException();
        }
    }


    // a,b가 0일 경우 예외처리 하는 메소드
    private static void checkZero(int a, int b) {
        if(a ==0 || b ==0){
            throw new ArithmeticException();
        }
    }


}

