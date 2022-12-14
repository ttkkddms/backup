package com.kh.exam1;


/*
 * 계좌모델링
 *
 *
 * */

public class Account {
  private String accountOwner;
  private int balance;

  public Account(String accountOwner) {
    this.accountOwner = accountOwner;
  }

  /**
   * @param money 입금액
   */
  public void deposit(int money) throws DepositLimitException {
    if (money < 0) {
      //System.out.println("음수 허용 불가");
      throw new MinusException("음수허용불가"); //unchecked exception
    }
    if (money > 40_000) {
      //System.out.println("입금한도 초과");
      throw new DepositLimitException("입금한도초과!", new Throwable("40_000원")); //checked exception
    }
    balance += money;
  }

  /**
   * 출금액
   *
   * @param money 출금
   */
  public void withdraw(int money) {
    balance -= money;
  }


  @Override
  public String toString() {
    return "Account{" +
        "accountOwner='" + accountOwner + '\'' +
        ", balance=" + balance +
        '}';
  }


  public String getAccountOwner() {
    return accountOwner;
  }

  public int getBalance() {
    return balance;
  }
}
