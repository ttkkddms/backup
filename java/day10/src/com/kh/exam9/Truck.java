package com.kh.exam9;

public class Truck extends Vehicle {
  // 트럭의 적재 중량에 대한 객체 변수를 선언한다
  private double lead;

  // 트럭의 모델명, 가격과 적재 중량을 주어진 값으로 초기화하면서
  // 객체를 생성한다
  public Truck(String model, int price, double lead) {
    super(model, price);
    this.lead = lead;
  }

  // 트럭의 적재 중량을 반환한다
  public double getLead() {
    return lead;
  }

  // 트럭의 세금을 계산한다
  @Override
  double calculateTex() {
    double tax = 0.0;
    if (lead >= 10_000) {
      tax = price* 0.04;
    } else if (lead >= 5_000) {
      tax = price * 0.02;
    } else {tax = price * 0.01;
    }
    return tax;
  }

  // 트럭의 모델명, 가격과 적재 중량을 반환한다
  @Override
  public String toString() {
    return super.toString() +
        ", 적재 중량 = " + lead + "\n";
  }


  // 트럭의 적재 중량을 주어진 값으로 변경한다
  public void setLead(double lead) {
    this.lead = lead;
  }
}