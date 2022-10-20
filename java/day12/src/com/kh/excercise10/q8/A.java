package com.kh.excercise10.q8;

public class A {
  int m = 2;
  static int n = 4;

  void method1() {
    System.out.println("A클래스 instance method");
  }
  static void method2() {
    System.out.println("A클래스 static method2");
  }
  private void method3() {
    System.out.println("A private");
  }
}

class B extends A {
//  int m = 6;
//  static int n = 8;

  void method1() {
    System.out.println("B클래스 instance method");
  }

  static void method2() {
    System.out.println("B클래스 static method");
  }
}
