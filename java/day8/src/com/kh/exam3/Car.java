package com.kh.exam3;

public class Car {
    private int id; //�� ���� �ĺ���ȣ
    private static int count; //�� �ĺ���ȣ �ο�
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

    public static int getCount() {//private���� �����ְ�����.
        return count;
    }
}
