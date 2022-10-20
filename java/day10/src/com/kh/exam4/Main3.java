package com.kh.exam4;

public class Main3 {
  public static void main(String[] args) {


    Person p1 = new Student();
    Person p2 = new Teacher();
    Person p3 = new HighStudent();

    //eat는 똑같지만 각각 결과가 다르게 나오는 것. 다형성.
    p1.eat();
    p2.eat();
    p3.eat();

    //다형성 구현의 전제조건
    //1) 개념과의 관계가 상속 또는 인터페이스 구현관계여야한다.
    //2) 상위개념에 하위개념을 대입한다.
    //3) 상위개념의 메소드가 하위개념의 메소드에서 재정의되어야한다.



  }
}