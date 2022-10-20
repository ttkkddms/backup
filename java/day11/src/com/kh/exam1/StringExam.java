package com.kh.exam1;

public class StringExam {
  public static void main(String[] args) {
    //기본타입값 비교
    int x = 10;
    int y = 10;
    int z = 30;
    System.out.println(x == y); //true
    System.out.println(x == z); //false


    //참조타입 값 비교(힙 메모리 주소값 비교) == 같은 인스턴스
    System.out.println("======================");
    String name = "홍길동";
    String name2 = "홍길동";
    String name3 = "홍길순";
    System.out.println(name == name2); //true
    System.out.println(name == name3); //false


    //
    System.out.println("======================");
    String name5 = new String("홍길동");
    String name6 = new String("홍길동");
    String name7 = new String("홍길순");
    System.out.println(name5 == name6);//false
    System.out.println(name5 == name7);//false


//    Object.equals():인스턴스간 == 주소비교
//    String.equals():인스턴스가 가지고있는 문자열 내용이 같은지 비교
    System.out.println(name5.equals(name6)); //true




  }
}
