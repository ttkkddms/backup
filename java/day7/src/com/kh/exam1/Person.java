package com.kh.exam1;

import java.lang.*;

public class Person extends Object {

    private final int MINAGE = 1;
    private final int MAXAGE = 100;

    //멤버필드
    private String name; //이름
    private int age; //나이
    private Gender gender; //성별


    //생성자 메서드 안만들어도 디폴트값 있음. new
    //alt + insert = constructor
    public Person() { //상위개념의 디폴트 생성자 호출
        super(); //상위개념 디폴트 생성자 호출
    }


    public Person(String name) { //이름만 넣었을때 나머지 기본값 설정
        //super();  this()랑 같이 사용 불가
        this(name, 1,Gender.MEN); //자신의 생성자 호출 형식 3개 다 있는것.
    }
    public Person(String name, int age, Gender gender) {
        //super();
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(int age, Gender gender) {
        //super();  그냥 this랑은 사용가능
        this.age = age;  //this는 가장 가까운 age보여줌
        this.gender = gender;
    }




    public Person(String name, Gender gender) {
        super(); //생략되어있는것
        this.name = name;
        this.age = 1;
        this.gender = gender;
    }





    //멤버메소드
    public void smile() {
        System.out.println("웃다.");
    }

    public void eat() {
        System.out.println("먹다.");
    }


    // 이름 반환 getter메소드  sout 이용해서 보여줌.
    public String getName() {
        return name.substring(1); //0,1 번째 자리부터 추출
    }



    //이름 수정 setter 메소드 void
    public void setName(String name) {
        this.name = name;
    } //메인에서 입력

    //나이 수정 setter메소드
    public void setAge(int age) {
        if (age >= MINAGE && age <= MAXAGE) {
            this.age = age;
        }
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }




    @Override
    public String toString() { //재정의
        String str = "";
        str += "이름 : " + this.name + "\n"; //줄바꿈
        str += "나이 : " + this.age + "\n";
        str += "성별 : " + this.gender + "\n";
        return str;
    }



//    재정의(상위메소드) ctrl + O
//    public String toString() {
//        return super.toString();
//    }

//    public String toStrimmmg() { // 오타나면 메소드되버림.
//        String str = "";
//        str += "이름 : " + this.name + "\n"; //줄바꿈
//        str += "나이 : " + this.age + "\n";
//        str += "성별 : " + this.gender + "\n";
//        return str;
//    }
//


}
