package com.kh.exam6;

//final + class : 최종개념으로 하위개념 올 수 없다.
//final + 변수 : 초기화 이후 재할당 불가능.
//final + 메소드 : 상위개념의 메소드를 하위개념에서 재정의가 불가능하다.
//final : 최종, 마지막의

public class Person {  //final 붙으면 하위개념 못만든다.
   final public void smile() {
    System.out.println("웃다");

  }

}
