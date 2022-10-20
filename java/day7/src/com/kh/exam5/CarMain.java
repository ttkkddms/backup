package com.kh.exam5;

import java.util.Arrays;
import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        Scanner scanner = new Scanner(System.in);

        boolean stop = false;
        do {
            System.out.println("메뉴] 1.차량구매 2. 차고지 출고 3.차고지현황 4.종료");
            System.out.print("선택 >> ");
            String menu = scanner.nextLine();
            switch (menu) {
                case "1":
                    System.out.print("원하는 차량 색깔은 : ");
                    String inputColor = scanner.nextLine();
                    boolean flag = false;
                    int i = 0;
                    for (i = 0; i < cars.length; i++) {
                        if (cars[i] == null) {
                            cars[i] = new Car(inputColor);
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) {
                        System.out.println("여유 공간 부족");
                        stop = true;
                    } else {
                        System.out.println("cars[" + i + "]번 차고지에 입고");
                        System.out.println(Arrays.toString(cars));
                    }
                    break;
                case "2":
                    System.out.println(" 출고할 차량 색상");
                    String colorOfCar = scanner.nextLine();
                    boolean finded = false;
                    for (int j = 0; j < cars.length; j++) {
                        if (cars[j].getColor().equals(colorOfCar)) {
                            cars[j] = null;
                            finded = true;
                            break;
                        }
                    }
                    if (!finded) {
                        System.out.println("출고하는 차량이 없습니다.");
                        continue;
                    }
                    break;


                case "3":
                    for (Car car : cars) {
                        if (car == null)
                            continue;
                        System.out.println(car.getColor());
                    }
                    break;
                case "4":
                    stop = true;
                default:
            }

        } while (!stop);
    }
}
//        cars[2] = new Car(); //생성
//        cars[1] = null; //해지
