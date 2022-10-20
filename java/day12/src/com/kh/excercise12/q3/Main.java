package com.kh.excercise12.q3;

public class Main {
  public static void main(String[] args) {
    A a = new A() { //익명클래스
      @Override
      void abc() {
        System.out.println("ㅎㅇ");
      }
    };
    a.abc();


    A b = new A() { //익명클래스 1회용
      @Override
      void abc() {
        System.out.println("ㅎㅇd");
      }
    };
    b.abc();


    A c = new B(); //재사용할거면 클래스 만들어서
    c.abc();
    A d = new B();
    d.abc();

  }
}
