package com.kh.exam4;

public class Main {
  public static void main(String[] args) {
    Person p1 = new Person();
    //p1.eat();
    //p1.smile();
    //p1.study();

    System.out.println("=======================");

    Student s1 = new Student();
   // s1.eat();
    //s1.smile();
    s1.study(); //student만 가능

    Teacher t1 = new Teacher();
   // t1.eat();
   // t1.smile();
    t1.teach(); //teacher만 가능


//다형성
    Person p2 = s1; //하위개념을 상위개념으로 대입. 업캐스팅 학생 - 사람
    //자동 형변환
    //하위개념의 실체를 상위개념으로 다루겠다.
    p2.eat();// student에 오버라이딩 되어있는걸로 나옴. 많이먹다.
    //p2.study(); student것 못함. person만 가능.


    System.out.println("========");

    //Student s2 = p2;  //상위개념을 하위개념에 대입 불가.
    Student s2 = (Student)p2;
    //강제 형변환  p2가 위에서 student타입이라 형변환 붙여서 변환가능
    s2.study();


    //컴파일 시점에서는 오류가 안나지만
    //런타임시 형변환 할 수 없다는 오류가 나타남
    //강제 형변환의 강제조건 : 실체가 강제형변환 하려는 타입이어야한다.
  //  Person p3 = p1;
   // Student s3 = (Student) p3; // p3 실체가  person이라 student붙여도 불가능
  //  s3.study();
  }
}
