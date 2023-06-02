package com.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class app1 {
    protected boolean con;

    public static void main(String[] args) {

        app1 app = new app1();
        Exception exce = new Exception();
        Input ip = new Input();

        Scanner in = new Scanner(System.in);
        app.con = true;

        while (app.con) {
            try {
                ip.inPutData();
                app.con = false; // while문 종료
            }

            catch (InputMismatchException e) {
                exce.InputException();
                in.nextLine(); // 입력버퍼에 값이 남아있으므로 비워줘야 함. 이 코드가 없으면 위의 문장들이 무한히 반복됨
            }

            catch (ArithmeticException e) {
                exce.AriException();
                in.nextLine();
            }

            catch (RuntimeException e) {
                exce.RunException();
                in.nextLine();
            }
        }
    }
}

