package com.kh.excercise.q7;

import com.kh.excercise.q6.Data;

import java.util.Iterator;

public class MyData implements Comparable<MyData> {
  String str;

  public MyData(String str) {
    this.str = str;
  }

  @Override
  public int hashCode() {
    System.out.println("hash 코드 호출");
    return super.hashCode();
  }


  @Override
  public int compareTo(MyData o) {
    System.out.println("compare 호출");
    int result = 0;
    if (this.str.length() > o.str.length()) {
      result = 1;
    } else if (this.str.length() < o.str.length()) {
      result = -1;
    }return result; //*-1
  }
  // return this.str.compareTo(o.str); 기본 ㄱㄷㄴ순
  // return this.str.compareTo(o.str)*-1; 기본 ㄱㄷㄴ 역순


  @Override
  public boolean equals(Object obj) {
    System.out.println("equals 호출");
    return super.equals(obj);


  }

  @Override
  public String toString() {
    return str;
  }
}
