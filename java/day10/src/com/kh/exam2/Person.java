package com.kh.exam2;
/*
static 초기화블럭 : static 멤버필드를 초기화하기위해 사용
                   (인스턴스 멤버 필드 사용 불가)
인스턴스 초기화블럭 : 인스턴스멤버를 초기화 하기위해 사용
                  (생성자보다 먼저 실행된다.)
 */

public class Person { //상위

  static String national = "한국";
  String name;
  {
    System.out.println("5"); //55
    name = "홍길동";
  }

  static {
    System.out.println("6");
    //System.out.println(name);
    national = "Korean";
  }

  public Person() { //33
    super();//44 오브젝트 객체 만든다.
    System.out.println("3"); //66
  }
}
