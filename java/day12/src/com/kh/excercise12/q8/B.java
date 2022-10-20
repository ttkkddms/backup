package com.kh.excercise12.q8;

class B implements A{
  @Override
  public void abc() {

    A.super.abc(); //default메소드 호출
    A.def(); //static의 메소드 호출
    System.out.println("B클래스의 abc");
  }
}
