package com.kh.exam2;

public class Student extends Person { //하위
  {
    System.out.println("4"); //77
  }

  static {
    System.out.println("7");
  }


  public Student() {
    super(); //항상 상단  22
    System.out.println("1"); //88
    System.out.println("2"); //99
    name = "ㅇㅇ";
  }
}
