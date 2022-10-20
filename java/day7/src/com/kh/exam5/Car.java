package com.kh.exam5;

public class Car {
    private String color;

    public void run() {
        System.out.println("운행하다.");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String color) {
        this.color = color;
    }


}
