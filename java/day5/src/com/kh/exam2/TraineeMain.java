package com.kh.exam2;

public class TraineeMain {
    public static void main(String[] args) {
        Trainee trainee = new Trainee(); //인스턴스화. 생성자호출
        trainee.study();
        trainee.doHomeWork();

        Trainee trainee2 = new Trainee("홍길동", 30); //인스턴스화
        trainee2.study();
        trainee2.doHomeWork();

        Trainee trainee3 = new Trainee("홍길동", 30, "여성"); //인스턴스화
        trainee3.study();
        trainee3.doHomeWork();

        Trainee[] trainees = new Trainee[3];
        trainees[0] = trainee;
        trainees[1] = trainee2;
        trainees[2] = trainee3;

        for (Trainee t : trainees) {
            t.study();
        }
    }
}