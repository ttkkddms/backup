package com.kh.exam7;
/*
 abstract + class (미완성개념) :
 1. 인스턴스를 만들 수 없다.
 2. 타입(개념)으로는 사용할 수 있다.
 3. abstract 메소드가 없어도 abstract키워드 사용가능

 abstract + method (미완성 메소드) :
 1. 메소드 선언부만 존재, 바디가 없다.
 2. abstract 메소드가 가 하나라도 존재하면 그 클래스는 abstract클래스여야한다.
* */

abstract public class Person {
  public Person() {
    super();
    System.out.println("Person생성자 호출");
  }
  public void eat() {
    System.out.println("먹다.");
  }
  abstract public void smile();
}
