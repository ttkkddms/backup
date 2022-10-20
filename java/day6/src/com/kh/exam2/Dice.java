package com.kh.exam2;

public class Dice {

//    멤버필드
    private int faceValue; //주사위눈의 상대값
    //private달면 캡슐화 클래스 내에서만 접근. 변경못하게.

    public Dice() {
        this.faceValue = 1; //주사위 초기값 1로 설정
    }

//    멤버메소드
//    주시위 굴리는 행위
//    this : new 생성자매소드()로 생설될 인스턴스(객체)
    public void roll() {
    this.faceValue = (int) Math.floor(Math.random() * 6) + 1;
    }

    public int getFaceValue() { //private 반환시키기. 읽기용도로.
        return faceValue;
    }

    public void setFaceValue(int num) {
        if (num >= 1 && num <= 6) {
        this.faceValue = num; //변경가능하도록 만들어주는것.
        }
    }

}
