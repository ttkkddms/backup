package com.kh.exam1;

class Person {
  public void eat() {
    System.out.println("먹다.");
  }

  public void study() {
    printLine('=', 30);
    System.out.println("상식 공부하다.");
    printLine('=', 30);
  }

  private void printLine(char ch, int cnt) {
    for (int i = 0; i < cnt; i++) {
      System.out.print(ch);
    }
    System.out.println();
  }
}


class Student extends Person {
  @Override
  public void study() {
    System.out.println("학교 공부하다.");
  }

  public void homework() {
    System.out.println("숙제하다.");
  }
}


class HighStudent extends Student {
  @Override
  public void study() {
    System.out.println("입시 공부하다.");
  }

  public void test() {
    System.out.println("시험보다.");
  }
}


public class Main1 {
  public static void main(String[] args) {
    Person p1 = new Person();
    Student s1 = new Student();
    HighStudent h1 = new HighStudent();

//    p1.eat();
//    s1.eat();
//    h1.eat();

//    p1.eat();
//    Person p2 = s1;
//    p2.eat();
//    Person p3 = h1;
//    p3.eat();


    //eat(p1);
    eat(s1);
    eat(h1);

  }

  public static void eat(Person p) { //상위타입  자동행변환. person관점. s1는 homework할 수 없다.
    p.eat();
    p.study();
    //p.homework

    Student s = (Student)p;
    s.homework();

//    if (p instanceof HighStudent) {
//      HighStudent h = (HighStudent) p;
//      h.test();
//    } else if (p instanceof Student) {
//      Student s = (Student) p;
//      s.homework();
//    }
  }
}
