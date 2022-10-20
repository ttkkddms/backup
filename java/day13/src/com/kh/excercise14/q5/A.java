package com.kh.excercise14.q5;

public class A implements AutoCloseable{
  String A;
  String res = "리소스할당";
  public void close() throws Exception {
    res = null;
    System.out.println("리소스 자동해제");
  }
}
