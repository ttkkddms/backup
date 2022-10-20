package com.kh.exam4;

public class Student extends Person {
  public int studentId;

  public Student() {
    super();
  }
  public void study() {
    System.out.println("공부하다.");
  }


  @Override //상위 개념에있는 것을 재정의한다. 오타나면 알려줌. 오버라이드 안달려있고 오타나면 새로운 걸로 인식.
  public void eat() {
    System.out.println("많이 먹다.");
  }
}
