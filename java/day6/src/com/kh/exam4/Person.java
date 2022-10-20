package com.kh.exam4;

import java.lang.*; // 컴파일시 자동생성이지만 안보이는것 1111
import java.util.Scanner; //스캐너는 불러와야함.

public class Person extends Object { //222 extends Object 최상위개념
    public Person(String name, int age, String gender) {  //3333
        super();//상위개념의 디폴트생성자호출 2번
        this.name = name;
        this.age = age;
        this.gender = gender;
    } //디폴트생성자로는 인스턴스 못만든다. ?? 찾아보기



    private String name;
    private int age;
    private String gender;



    @Override //재정의  용도 : 현재 인스턴스의 상태를 문자열로 표현
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';

    }
}
