package com.kh.exam2;

public class Main {
  public static void main(String[] args) { //정적
    int x = 10;
    int y = 20;
    int result = sum(10, 20);

    Main main = new Main();
    main.sum2(x, y); //정적 안에 인스턴스 만들어야 인스턴스 씀
  }

  private static int sum(int num1, int num2) { //정적이어야 위에 sum 적용 가능
    int result = 0;
    result = num1 + num2;
    return result;
  }

  private int sum2(int x, int y) {
    return x + y;
  }
}
