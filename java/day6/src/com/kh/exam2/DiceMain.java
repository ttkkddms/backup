package com.kh.exam2;

public class DiceMain {
    public static void main(String[] args) {

        //주사위 인스턴스 2개 생성
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        //각각 던지기
        dice1.roll();
        dice2.roll();


        //합이 10보다 크면 당첨
        //dice1.faceValue = 100; Dice클래스에 private 없으면 이렇게 값을 변경할 수 있음.
        int sumOfDice = dice1.getFaceValue() + dice2.getFaceValue();

        System.out.println("dice1의 눈 : " + dice1.getFaceValue());
        System.out.println("dice2의 눈 : " + dice2.getFaceValue());

        if (sumOfDice > 10) {
            System.out.println("당첨!");
        } else {
            System.out.println("꽝!");
        }
    }
}
