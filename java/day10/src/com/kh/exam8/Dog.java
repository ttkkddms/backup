package com.kh.exam8;

// 실습과제 10.1: Dog.java
// 개를 모델한다

public class Dog extends Pet {
  private String breed;      // 품종
  private boolean boosterShot;  // 예방주사 접종여부


  // 개의 이름, 나이, 품종을 각각 주어진 값으로 초기화하고
  // 예방주사 접종여부는 false로 초기화하면서 Dog 객체를 생성한다
  public Dog() {
    super();
    breed = "";
    boosterShot = false;
  }


  public Dog(String name, int age, String breed) {
    super(name, age); //부모클래스에서 호출
    this.breed = breed;
    boosterShot = false;
  }

  @Override
  public String toString() {
    String str = super.toString();
      str += "품종='" + breed + "\n";
      if (boosterShot)
        str += "예방접종 완료";
      else
        str += "예방접종 미완료";

      return str;
  }

    // 개의 품종을 변경한다
    public void setBreed (String newBreed){
      breed = newBreed;
    }

    // 개의 예방주사 접종여부를 변경한다
    public void setBoosterShot ( boolean newShot){
      boosterShot = newShot;
    }


    // 개의 품종을 알려 준다
    public String getBreed () {
      return breed;
    }

    // 개의 예방주사 접종여부를 알려 준다
    public boolean getBoosterShot () {
      return boosterShot;
    }
  }


