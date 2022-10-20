package com.kh.excercise10.q8;

/*
 * 1. 상속관계에서의 멤버필드는 상속되지않는다.(재정의불가능)
 * 2. 상속관계에서 인스턴스멤버메소드는 상속될 때 재정의 할 수 있다.
 * 3. static 멤버는 클래스, 인터페이스에 고정되어 사용된다.
 * 4. private,static 멤버메소드는 상속불가.
 * */
public class Main {
  public static void main(String[] args) {

    A ab = new B();
    System.out.println(A.n);
    System.out.println(B.n);
    ab.method1();
    ab.method2();


    B b = new B();
    b.method1();
    System.out.println(b.m);
    System.out.println(b.n);

  }

}
