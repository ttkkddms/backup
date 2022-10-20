package com.kh.exam1;

//개념정리하고 정의된 개념에 이름을 붙임.
public class Car {
    //인스턴스 멤버필드 : 객체의 상태, 정보를 표현
    String color;
    String cc;
    String maker;

    //생성자 메소드 : 객체 생성시 초기화. 반환타입이 없다.
    //클래스 이름과 같아야한다.
    //this
    public Car(String color, String cc, String maker) {
        this.color = color;
        this.cc = cc;
        this.maker = maker;
    }

    //인스턴스 멤버 메소드 : 객체의 행위, 동작. 반환타입이 있다.
    public void start() {
        System.out.println(this.color+" 출발하다.");
    }
    public void run() {
        System.out.println(this.cc+" 주행하다.");
    }
    public void stop() {
        System.out.println(this.color+" 멈추다.");
    }
}


