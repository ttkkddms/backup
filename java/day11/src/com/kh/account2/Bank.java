package com.kh.account2;

import java.util.Arrays;
import java.util.Scanner;

public class Bank {
  private static final int OPEN_ACCOUNT_LIMIT = 5;
  private Account[] accounts = new Account[OPEN_ACCOUNT_LIMIT];
  private static final int NOT_FOUNT = -1;


  //신규
  public void createAccount(String accountName) {
    //비어있는 요소 찾아오기
    int idx = findNullIndex();
    if (idx == NOT_FOUNT) {
      System.out.println("계좌 개설 한도가 모두 찼습니다.");
      return;
    }
    if (dupChkAccountName(accounts, accountName)) {
      System.out.println("동명이인이 존재합니다.");
      return;
    } else {
      accounts[idx] = new Account(accountName);
      System.out.println(accountName + "님의 신규계좌가 생성되었습니다.");
      System.out.println(accounts[idx]);
    }
  }

  //폐지
  public void closeAccount(String accountNumber) {
    int idx = findIndexOfAccount(accountNumber);
    if (idx == NOT_FOUNT) {
      System.out.println("계좌가 없습니다.");
      return;
    }
    if (accounts[idx].getBalance() > 0) {
      System.out.println("잔액이 존재합니다.");
      System.out.println(accounts[idx]);
    } else {
      accounts[idx] = null;
    }
  }

  //입금
  public void deposit(String accountNumber, int money) {
    int idx = findIndexOfAccount(accountNumber);
    if (idx == NOT_FOUNT) {
      System.out.println("찾는 계좌가 없습니다.");
      return;
    }
    accounts[idx].deposit(money);
    System.out.println(accounts[idx].toString());
  }

  //출금
  public void withdraw(String accountNumber, int money) {
    int idx = findIndexOfAccount(accountNumber);
    if (idx == NOT_FOUNT) {
      System.out.println("찾는 계좌가 없습니다.");
      return;
    }
    accounts[idx].withdraw(money);
    System.out.println(accounts[idx].toString());
  }

  //조회 (개별)
  public void printAccount(String accountNumber) {
    int idx = findIndexOfAccount(accountNumber);
    if (idx == NOT_FOUNT) {
      System.out.println("찾는 계좌가 없습니다.");
      return;
    }
    System.out.println(accounts[idx].toString());
  }

  //조회(전체)
  public void printAllAccount() {
    int usingCount = 0;
    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i] == null) continue;
      System.out.println(accounts[i]);
      ++usingCount;
    }
    System.out.println("사용중인 계좌 수 : " + usingCount);
    System.out.println("잔여계좌수 : " + (accounts.length - usingCount));
  }

  //비어있는 요소의 인덱스 번호를 반환, 없으면 -1 반환
  private int findNullIndex() {
    int findedIndex = NOT_FOUNT;
    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i] == null) {
        findedIndex = i;
        break;
      }
    }
    return findedIndex;
  }

  //계좌번호와 일치하는 인덱스 번호를 반환, 없으면 -1반환
  private int findIndexOfAccount(String accountNumber) {
    int findedIndex = NOT_FOUNT;
    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i] == null) {
        continue;
      }
      String tmpAccountNumber = accounts[i].getAccountNumber();
      if (tmpAccountNumber.equals(accountNumber)) {
        findedIndex = i;
        break;
      }
    }
    return findedIndex;
  }

  //동명이인체크
  private boolean dupChkAccountName(Account[] accounts, String accountName) {
    boolean dupChk = false;
    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i] == null) {
        continue;
      }
      if (accounts[i].getAccountName().equals(accountName)) {
        dupChk = true;//동명이인 있으면 true반환
        break;
      }
    }
    return dupChk;
  }
}
