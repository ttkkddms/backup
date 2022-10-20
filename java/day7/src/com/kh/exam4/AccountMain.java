package com.kh.exam4;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        Account account = null;




        do {
            System.out.println("1.계좌개설 2.입금 3.출금 4.잔액 5.종료");
            System.out.print(">>> ");
            String menuValue = scanner.nextLine();
            int money = 0;

            switch (menuValue) {
                case "1":
                    System.out.println("1. 이름을 입력하세요");
                    System.out.print(">>> ");
                    String name = scanner.nextLine();
                    account = new Account(name);
                    System.out.println(name + "님의 계좌가 생성되었습니다.");
                    break;

                case "2":
                    if (account == null) {
                        System.out.println("계좌 미개설 상태입니다.");
                        continue;
                    }
                    System.out.println("2. 입금금액을 입력하세요");
                    System.out.print(">>> ");
                    money = Integer.valueOf(scanner.nextLine());
                    account.deposit(money);
                    break;

                case "3":
                    if (account == null) {
                        System.out.println("계좌 미개설 상태입니다.");
                        continue;
                    }
                    System.out.println("3. 출금금액을 입력하세요.");
                    System.out.print(">>> ");
                    money = Integer.parseInt(scanner.nextLine());
                    account.withdraw(money);
                    break;


                case "4":
                    if (account == null) {
                        System.out.println("계좌 미개설 상태입니다.");
                        continue;
                    } else {
                        System.out.println("4. 잔액조회");
                        long balance = account.getBalance();
                        System.out.println(account.getName() + " 님의 잔액 : " + balance);
                        break;
                    }

                case "5":
                    System.out.println("5. 종료합니다.");
                    stop = true;
                    break;
                default:
            }
        } while (!stop);
    }
}







