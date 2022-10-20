package com.kh.exam1;

import java.util.Objects;

public class Person {
  private String name;
  private int age;

  public Person(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return this.name;
  }


  //같은값 비교해서 거르기
  //키객체는 equals,hash 재정의해서 거르기.alt + insert


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return age == person.age && Objects.equals(name, person.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }

}
