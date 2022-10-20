package com.kh.excercise.q5;

import java.util.Objects;

public class Data {
  int m;

  public Data(int m) {
    this.m = m;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Data) {
      return this.m == ((Data) obj).m;
    }else
      return false;
  }

//  @Override
//  public int hashCode() {
//    return Objects.hash(m);
//  }



}
