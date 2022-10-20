package com.kh.exam4;

/*
인터페이스 특징
1. 멤버필드는 상수(static final)만 올수 있다. 생략해도 자동 컴파일
2. 멤버메소드는 추상메소드가 온다. (메소드 선언부)호출아름, 입력, 출력
3. 모든 멤버는 public (public 키워드 명시 안해도 자동 public)
4. 인스턴스르 만들수 없다. 하지만 타입으로는 사용가능(구현체 대입)
5. 인터페이스 구현은 다중 구현이 가능
6. 인터페이스간의 상속은 단일상속.
 */

public interface HomeAppliances {
  public static final int voltage = 220;

  //전원을 켜다
  public abstract void on();

  //전원을 끄다
  abstract public void off();


  // default, static
  //1)자바8버전에 등장
  //2)목적 : 기존에 인터페이스를 구현하고있던 구현체에 영향을 주지 않고 기능 추가
  //3) default : 구현클래스에서 재정의 가능
  //4) static : 인터페이스.메소드이름 으로 사용할 수 있다.

  //음성인식
  default void listenVoice() {
    System.out.println("음성인식하다.");
  }

  static void doInter() { //클래스에서 재정의불가.
    System.out.println("인터넷하다.");
  }
}
