package com.kh.exam1;

import java.util.Scanner;
public class Exam1Main2 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator("빨강");
        Calculator c2 = new Calculator("빨강", "모닝글로리");

        //파워 켜기
        c1.powerOn();

        try {
            System.out.println(c1.getResult());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        //값 키보드에서 입력받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("값1 : ");
        //String input = scanner.nextLine();
        double value1 = Double.parseDouble(scanner.nextLine());//Double 은 클래스임. 대문자. p 이용해서 인스턴스화 하지않고 바로 이용

        System.out.print("값2 : ");
        //String input2 = scanner.nextLine();
        double value2 = Double.parseDouble(scanner.nextLine()); //반환값이 double

        c1.plus(value1, value2);
        try {
            System.out.println(c1.getResult());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // System.out.println(c1.getResult());
    }
}
