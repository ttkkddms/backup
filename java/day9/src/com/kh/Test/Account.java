package com.kh.Test;

public class Account extends Object {

  private String ano;
  private String owner;
  private int balance;

  public Account(String ano, String owner, int balance) {
    this.ano = ano;
    this.owner = owner;
    this.balance = balance;
  }


  public String getAno() {
    return ano;
  }

  public String getOwner() {
    return owner;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }


  @Override
  public String toString() {
    return "계좌[" +
        "계좌번호='" + ano + '\'' +
        ", 예금주='" + owner + '\'' +
        ", 잔액=" + balance +
        ']';
  }
}
