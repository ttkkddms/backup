package com.kh.exam5;

public class Main {
  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    double result = sum(x, y);//자동형변환 작은게 큰것으로. int를 double로.
  }

  public static int sum(double x, double y) { //int로 반환해야함. 근데 결과가 double임.
    return (int) (x + y); //double타입을 int로. 큰걸 작은걸로. 강제형변환.
  }

}
