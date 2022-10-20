package com.kh.excercise.q6;

import java.util.Objects;

public class Data {
  int m;
  int n;
  public Data(int m) {
    this.m = m;
  }

  public Data(int m, int n) {
    this.m = m;
    this.n = n;
  }


  @Override
  public String toString() {
    return "Data{" +
        "m=" + m +
        ", n=" + n +
        '}';
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Data) {
      return this.m == ((Data) obj).m &&this.n == ((Data) obj).n;
    }else
      return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(m,n);
  }
}
