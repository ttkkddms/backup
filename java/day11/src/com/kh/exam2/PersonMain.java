package com.kh.exam2;

public class PersonMain {
  public static void main(String[] args) {
    Person p1 = new Person(20);
    Person p2 = new Person(20);
    System.out.println(p1 == p2);//false

    System.out.println(p1.equals(p2));//equals 재정의 해주어야 가능
    System.out.println();

  }

}
