package com.kh.excercise10.q10;
/*
*
* this(), super() 같이 올수 없다.
* super()이 기본값.
*
* */
class A {
  A(){
    System.out.println("A 생성자1");
  }

  A(int a) {
    this();
    System.out.println("A 생성자2");
  }
}

class B extends A {
  B() {
    System.out.println("B 생성자1");
  }

  B(int a) {
    super(a);
    System.out.println("B 생성자2");
  }
}
