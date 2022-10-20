package com.kh.exam4;

public class Main2 {
  public static void main(String[] args) {
    int x = 10;
    double y = 20; //자동 형변환. 작은 타입을 큰 타입에 대입

    double i = 20;//큰 타입을 작은타입에 대입할 수 없다.
    int j = (int) i; //큰 타입을 작은 타입에 대입하려면 형변환 연산자를 사용
    //값의 손실이 없는 전제하에 강제로 형변환해준다.

    byte k = 127;  //-128~127 범위
    byte l = (byte) (k + 1);//-128
    byte m = (byte) (k - 1); //126


    int a = 200;
    byte b = (byte) a;//이상한 수
    a = 10;
    b = (byte) a;//10
  }
}
