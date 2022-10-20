package com.kh.exam3;

public class Car {
    private int id; //차 고유 식별번호
    private static int count; //차 식별번호 부여
    private String color;

    public Car(String color) {
        super();
        this.color = color;
        id = ++Car.count;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color;

    }

    public int getId() {
        return id;
    }

    public static int getCount() {//private값을 보내주게해줌.
        return count;
    }
}
