package com.kh.exam2;
//횟수 키보드입력
public class DiceMain3 {
    public static void main(String[] args) {

        final int COUNT = 5;

        Dice[] dice = new Dice[COUNT];

        //인스턴스 생성 주사위값
        for (int i = 0; i < dice.length; i++) {
            dice[i] = new Dice();
        }

        //던지기 합계
        int sum = 0;
        for (int i = 0; i < dice.length; i++) {
            dice[i].roll();
            System.out.println(i+"번째 주사위눈 : "+dice[i].getFaceValue());
            sum += dice[i].getFaceValue();
        }

        System.out.println(COUNT+"개 주사위 눈의 합 = " + sum);
    }
}
