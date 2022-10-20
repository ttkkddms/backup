package com.kh.exam4;

public class AirConditioner implements HomeAppliances { //바디 구현해야 적용가능
  @Override
  public void on() {
    System.out.println("에어컨을 켜다.");
  }
  @Override
  public void off() {
    System.out.println("에어컨을 끄다.");
  }

}
