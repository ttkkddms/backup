package com.kh.exam4;

import java.util.Scanner;

public class AccountMain {
  private static Scanner scanner = new Scanner(System.in);
  static int max = 10;
  private static Account[] accountArray = new Account[max];

  public static void main(String[] args) {


    boolean run = true;
    while (run) {
      System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
      System.out.print("선택> ");
      int menu = scanner.nextInt();
      if (menu == 1) {
        createAccount();
      } else if (menu == 2) {
        accountList();
      } else if (menu == 3) {
        deposit();
      } else if (menu == 4) {
        withdraw();
      } else if (menu == 5) {
        run = false;
      }
    }
    System.out.println("프로그램 종료");
  }



  private static void createAccount() {
    System.out.println("계좌생성");
    System.out.print("계좌번호: ");
    String ano = scanner.next();

    System.out.print("계좌주: ");
    String owner = scanner.next();

    System.out.print("초기입금액: ");
    int money = scanner.nextInt();

    for (int i = 0; i < accountArray.length; i++) {
      if (accountArray[i] == null) {
        accountArray[i] = new Account(ano, owner, money);
        System.out.println("결과: 계좌가 생성되었습니다.");
        break;
      }
    }

  }

  private static void accountList() {
    System.out.println("--------");
    System.out.println("계좌목록");
    System.out.println("--------");
    for (int i = 0; i < accountArray.length; i++) {
      if (accountArray[i] == null) {
        break;
      }
      System.out.println(
          accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
    }
    //작성 위치
  }

  //Account 배열에서 ano와 동일한 Account 객체 찾기
  private static Account findAccount(String ano) {
    //작성 위치
    for (int i = 0; i < accountArray.length; i++) {
      if (accountArray[i] == null) {
        break;
      }
      if (accountArray[i].getAno().equals(ano)) {
        return accountArray[i];
      }
    }
    return null;
  }

  private static void deposit() {
    System.out.println("--------");
    System.out.println("예금");
    System.out.println("--------");
    System.out.print("계좌번호: ");
    String ano = scanner.next();
    System.out.print("예금액: ");
    int dep = scanner.nextInt();

    if (findAccount(ano) == null) {
      System.out.println("입력한 계좌번호를 찾지 못했습니다.");
    } else {
      findAccount(ano).setBalance(findAccount(ano).getBalance() + dep);
      System.out.println("결과: 입금이 성공되었습니다.");
    }

  }

  private static void withdraw() {
    System.out.println("출금");
    System.out.print("계좌번호: ");
    String ano = scanner.next();
    System.out.print("출금액: ");
    int withd = scanner.nextInt();

    if (findAccount(ano) == null) {
      System.out.println("입력한 계좌번호를 찾지 못했습니다.");
    } else {
      if (withd > findAccount(ano).getBalance()) {
        System.out.println("잔액보다 큰 액수를 입력하셨습니다.");
      } else {
        findAccount(ano).setBalance(findAccount(ano).getBalance() - withd);
        System.out.println("결과: 출금이 성공되었습니다.");
      }
    }
  }
}

