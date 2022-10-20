package com.kh.exam2;

public class Account extends Object {
    private String accOwner; //계정주
    private long balance; //잔액 0l;


    public Account(String accOwner) {
        super(); //생략되어있음
        this.accOwner = accOwner;
    }



    public void deposit(int money) { //입금
        this.balance += money;
    }
    public void withdraw(int money) { //출금
        this.balance -= money;
    }




    public String getAccOwner() {
        return accOwner;
    }
    public void setAccOwner(String accOwner) {
        this.accOwner = accOwner;
    }

    public long getBalance() { //보여주는값
        return balance;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }



    @Override
    public String toString() {
        return "계좌[" +
                "소유자명='" + accOwner + '\'' +
                ", 잔액=" + balance +
                ']';
    }


}

