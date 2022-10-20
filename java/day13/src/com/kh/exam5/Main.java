package com.kh.exam5;


//unchecked exception


/*2. checked & unchecked  exception 차이점
 : checked 일반예외는 컴파일 시점에 처리하지않으면 실행자체가 불가능하다. RuntimeException을 상속하지않는 Exception
 : unchecked 실행예외는 실행 할 때 체크한다.  RuntimeException을 상속하는 Exception
	실행시 예외가 발생할 수 있다. 프로그래머의 역량에 의존적이다.
	예외발생시 예외를 처리하지않으면 자동으로 위임된다.
* */
public class Main {
  public static void main(String[] args) {

    method1();
  }


  private static void method1() {
    try {
      method2();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  private static void method2() {
    int[] arr = new int[3];
    arr[3] = 10;
  }
}
