package com.kh.exam1;

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.smile(); //smile 메소드 실행
        p1.eat(); //eat 메소드 실행

        Person p2 = new Person();
        p2.smile();
        p2.eat();

        Person p3 = new Person("홍길동", Gender.WOMEN);
        System.out.println(p3.getName()); //홍길동
        p3.setName("해리"); // 수정 void
        System.out.println(p3.getName()); //해리
        System.out.println(p3.toString()); //해리, 1세, 우먼


        p3.setName("해롤드"); //수정 void
        p3.setAge(28); //수정 void

        System.out.println(p3);

        p3.setGender(Gender.MEN);

        System.out.println(p3.toString()); //같음
        System.out.println(p3);


        System.out.println(p3.getName());
    }
}
