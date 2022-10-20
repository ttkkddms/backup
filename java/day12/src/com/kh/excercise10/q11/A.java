package com.kh.excercise10.q11;

/*
* 1. 동일비교 .인스턴스의 실체가 같은지(주소비교) ==    Object.equals()
2. 동등비교 .인스턴스의 속성값이 값은지 (내용비교) equals를 재정의하기.
*
* */
public class A {
  int data;

  A(int data) {
    this.data = data;
  }  //동일비교. 위치


  @Override
  public boolean equals(Object obj) {
    boolean result = false;
    if (obj instanceof A) {
      if (this.data == ((A) obj).data) {   //동등비교. 내용
        result = true;
      }
    }
    return result;
  }
}
