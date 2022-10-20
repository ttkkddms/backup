package com.kh.exam4;

public class HighStudent extends Student {

  @Override
  public void eat() {
    super.eat(); //부모 Student eat 호출 많이먹다.
    System.out.println("영양제도 먹다."); //재정의

  }
}
