package com.kh.Test;

import java.util.Scanner;

public class AccountMain {

  private static int max = 5;
  private static Account[] accountArray = new Account[max];
  private static Scanner scanner = new Scanner(System.in);
  public static int count = 0;
  static int used = accountArray.length;
  static int man = max - accountArray.length;

  public static void main(String[] args) {
    boolean stop = false;
    while (!stop) {
      System.out.println("-------------------------------------------------------------------------");
      System.out.println("1.신규계좌생성 2.계좌폐지 3.입금 4.출금 5.계좌조회(개별) 6.계좌조회(전체) 7.종료");
      System.out.println("-------------------------------------------------------------------------");
      System.out.print("선택> ");
      int menu = scanner.nextInt();
      if (menu == 1) {
        createAccount();
      } else if ((menu == 2)) {
        removeAccount();
      } else if (menu == 3) {
        deposit();
      } else if (menu == 4) {
        withdraw();
      } else if (menu == 5) {
        showAccount();
      } else if (menu == 6) {
        accountList();
      } else if (menu == 7) {
        System.out.println("종료합니다.");
        stop = true;
      } else System.out.println("잘못입력하셨습니다.");
    }
  }

//    신규계좌생성
  private static void createAccount() {
    System.out.println("1. 신규계좌생성");
    System.out.print("예금주 : ");
    String owner = scanner.next();
    String tmp = count + 1 + "";
    int length = 3 - tmp.length();
    for (int i = 0; i < length; i++) {
      tmp = "0" + tmp;
    }
    String ano = tmp;
    System.out.println("계좌번호 : " + ano);
    System.out.println("잔액 : 0");
    int money = 0;
    accountArray[count++] = new Account(ano, owner, money);
    System.out.println("결과: 계좌가 생성되었습니다.");
  }

//    폐지
  private static void removeAccount() {
    System.out.print("삭제할 계좌번호 입력 : ");
    String ano = scanner.next();
    Account account = findAccount(ano);
    if (findAccount(ano) == null) {
      System.out.println("입력한 계좌번호를 찾지 못했습니다.");
    } else {
      for (int i = 0; i < count; i++) {
        if (accountArray[i].getAno().equals(ano)) {
          if (accountArray[i].getBalance() > 0) {
            System.out.println("잔액이 남아있습니다. 폐지가 불가능합니다. 잔액 : " + accountArray[i].getBalance());
          } else {
            System.out.println("계좌번호 : " + accountArray[i].getAno());
            System.out.println("예금주 : " + accountArray[i].getOwner());
            System.out.println("잔액 : " + accountArray[i].getBalance());
            System.out.print("계좌를 삭제하시겠습니까? (Y/N) : ");
            String yn = scanner.next();
            if (yn.equals("Y")) {
              System.out.println("폐지되었습니다.");
              accountArray[i] = null;
              break;
            } else if (yn.equals("N")) {
              System.out.println("삭제가 취소되었습니다.");
              break;
            }
          }
        }
      }
    }
  }

//    입금
  private static void deposit() {
    System.out.println("3. 입금");
    System.out.print("계좌번호를 입력하세요 : ");
    String ano = scanner.next();
    if (findAccount(ano) == null) {
      System.out.println("입력한 계좌번호를 찾지 못했습니다.");
    } else {
      System.out.print("입금액 : ");
      int dep = scanner.nextInt();
      if (findAccount(ano).getBalance() + dep > 100000) {
        System.out.println("예치금액한도는 10만원입니다. 잔고 : " + findAccount(ano).getBalance());
      } else if (dep > 40000) {
        System.out.println("1회 입금한도는 4만원입니다. 잔고 : " + findAccount(ano).getBalance());
      } else {
        findAccount(ano).setBalance(findAccount(ano).getBalance() + dep);
        System.out.println("결과: 입금이 성공되었습니다. 잔액 : " + findAccount(ano).getBalance());
      }
    }
  }


//    출금
  private static void withdraw() {
    System.out.println("4. 출금");
    System.out.print("계좌번호 : ");
    String ano = scanner.next();
    System.out.print("출금액: ");
    int withd = scanner.nextInt();

    if (findAccount(ano) == null) {
      System.out.println("입력한 계좌번호를 찾지 못했습니다.");
    } else {
      if (withd > 40000) {
        System.out.println("1회 출금한도는 4만원입니다. 잔고 : " + findAccount(ano).getBalance());
      } else if (findAccount(ano).getBalance() - withd < 0 || withd > findAccount(ano).getBalance()) {
        System.out.println("잔고가 부족합니다. 잔고 : " + findAccount(ano).getBalance());
      } else {
        findAccount(ano).setBalance(findAccount(ano).getBalance() - withd);
        System.out.println("결과: 출금이 성공되었습니다. 잔고 : " + findAccount(ano).getBalance());
      }
    }
  }

//    개별계좌조회
  private static void showAccount() {
    System.out.println("5. 계좌조회");
    System.out.print("계좌번호 입력 : ");
    String ano = scanner.next();
    Account account = findAccount(ano);
    if (account == null) {
      System.out.println("입력한 계좌번호를 찾지 못했습니다.");
    } else {
      System.out.println(
          "계좌번호 : " + account.getAno() + "\n" + "예금주 : " + account.getOwner() + "\n" + "잔고 : " + account.getBalance());
    }
  }

  //  계좌번호로 계좌정보찾기
  private static Account findAccount(String ano) {
    for (int i = 0; i < count; i++) {
      if (accountArray[i].getAno().equals(ano)) {
        return accountArray[i];
      }
    }
    return null;
  }


  // 계좌목록
  private static void accountList() {
    int i = 0;
    int used = count; //사용중
    int man = max - count; //남은 계좌
    System.out.println("계좌목록");
    for (i = 0; i < count; i++) {
      System.out.println(
          "계좌번호 : " + accountArray[i].getAno() + "\n" +
              "예금주 : " + accountArray[i].getOwner() + "\n" +
              "잔고 : " + accountArray[i].getBalance() + "\n" +
              "사용중인 계좌수 : " + used + "\n" +
              "생성 가능한 계좌수 : " + man + "\n" +
          "---------------------------------------");
    }
  }
}

