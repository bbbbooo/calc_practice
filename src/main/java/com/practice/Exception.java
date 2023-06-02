package com.practice;

public class Exception {
    public void InputException(){
        System.out.println("------------------------");
        System.out.println("잘못된 값이 입력되었습니다.");
        System.out.println("정수만 입력할 수 있습니다.");
        System.out.println("다시 입력해주세요.");
        System.out.println("------------------------");
    }

    public void AriException(){
        System.out.println("------------------------");
        System.out.println("0으로는 나눌 수 없습니다.");
        System.out.println("다시 입력해주세요.");
        System.out.println("------------------------");
    }

    public void RunException(){
        System.out.println("------------------------");
        System.out.println("잘못된 값이 입력되었습니다.");
        System.out.println("사칙연산(+ - * / %)을 정확히 입력해주세요.");
        System.out.println("다시 입력해주세요.");
        System.out.println("------------------------");
    }
}
