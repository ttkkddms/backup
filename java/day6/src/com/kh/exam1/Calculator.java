package com.kh.exam1;

public class Calculator {

    private String color;
    private String maker;

    private boolean power; //false
    private double result; //동일 클래스내에서만 접근가능

// 디폴트 생성자 : 매개변수가 정의되지 않은 생성자
//          개발자가 명시하지 않으면 컴파일러가 자동 생성
//          개발자가 명시적으로 생성자를 1개라도 만들면 디폴트생성자는 자동생성 안함
//    public Calculator() {
//        super();
//    }
    public Calculator(String color) { //생성자
        this.color = color;
    }
    public Calculator(String color, String maker) {
        this.color = color;
        this.maker = maker;
    }


    //4칙연산
    public void plus(double x, double y) {
       if (this.power == false) {
            System.out.println("파워를 켜주세요.");
            return; //메소드에서 리턴만나면 종료.
        }
        this.result = x + y;
    }

    public void minus(double x, double y) {
        if (this.power == false) {
            System.out.println("파워를 켜주세요!");
            return;
        }
        this.result = x - y;
    }

//켬
    public void powerOn() {
        this.power = true;
    }
//끔
    public void powerOff() {
        this.power = false;
    }
//현재 파워 온오프 상태
    public boolean isPower() {
        return this.power;
    }

    public double getResult() throws Exception {
        if (this.power == false) {
            throw new Exception("파워 on");
        }
        return this.result;
    }

    public String getColor() {
        return this.color;
    }

    public String getMaker() {
        return this.maker;
    }
}