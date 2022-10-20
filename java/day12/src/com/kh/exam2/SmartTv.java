package com.kh.exam2;

public class SmartTv extends Tv implements SmartInternet{

//  TV에 있는 것들이라서. 재정의해도 됨ㅇㅇ
  @Override
  public void on() {
    System.out.println("스마트 TV를 켜다");

  }
  @Override
  public void off() {
    System.out.println("스마트 TV를 끄다");

  }

//  @Override
//  public String search(String keyword) {
//
//    return keyword;
//  }

  @Override
  public void listenVoice() {
    System.out.println("스마트 TV 음성인식하다");

  }
}
