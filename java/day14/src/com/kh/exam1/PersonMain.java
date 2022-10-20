package com.kh.exam1;

import java.util.HashSet;
import java.util.Set;

public class PersonMain {
  public static void main(String[] args) {
    Person p1 = new Person("홍길동");
    Person p2 = new Person("홍길서");
    Person p3 = new Person("홍길남");
    Person p4 = new Person("홍길동"); //중복x

    Set<Person> set = new HashSet<Person>();
    set.add(p1);
    set.add(p2);
    set.add(p3);
    set.add(p4);

    System.out.println(set.toString()); //순서가 상관없이 나옴

    //요소검색
    System.out.println(set.contains("홍길동"));
    System.out.println(set.contains("홍길동1"));
    System.out.println(set.contains("홍길서"));

    //요소검색(컬렉션이 비워져있는지)
    System.out.println(set.isEmpty());

    //요소검색(요소수)
    System.out.println(set.size());
    System.out.println("========");
    //요소순환
    for (Person ele : set) {
      System.out.println(ele);
    }

    //요소삭제(동등객체 삭제)
    set.remove("홍길서");
    System.out.println(set);
    System.out.println("=============");

    //요소삭제(전제)
    set.clear();
    System.out.println(set.size()); //0


  }
}
