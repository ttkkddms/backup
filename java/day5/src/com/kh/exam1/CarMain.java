package com.kh.exam1;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("white", "2000cc", "현대"); //실체화, 인스턴스화
        Car car2 = new Car("red", "2500cc", "기아"); //실체화, 인스턴스화
        Car car3 = new Car("black", "3000cc", "삼성"); //실체화, 인스턴스화


        car.start();
        car.run();

        car2.start();
        car2.run();

        car3.start();
        car3.run();
    }
}
