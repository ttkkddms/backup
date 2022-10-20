package com.kh.exam3;

public class Account {
    private int LIMIT_MONEY_ONETIME = 100_000; //1회 입금한도
    private int LIMIT_BALANCE = -1_000_000; //마이너스 잔액한도
    private String name; //예금주
    private long balance; //잔액

    public Account(String name) {
        this.name = name;
    }


    public Account(int LIMIT_MONEY_ONETIME, int LIMIT_BALANCE, String name, long balance) {
        this.LIMIT_MONEY_ONETIME = LIMIT_MONEY_ONETIME;
        this.LIMIT_BALANCE = LIMIT_BALANCE;
        this.name = name;
        this.balance = balance;
    }


    public String getName() { //이름보여줌
        return name;
    }

    public void setName(String name) { //이름변경
        this.name = name;
    }

    public long getBalance() { //잔액보여줌
        return balance;
    }

    public void setBalance(long balance) { //잔액변경
        this.balance = balance;
    }


    //입금
    public void deposit(int money) {
        if (money < 1 || money > LIMIT_MONEY_ONETIME) {
            System.out.println("입금오류 : 1회 입금액은 " + LIMIT_MONEY_ONETIME + "원 미만이어야합니다.");
            return; //수행중이던 메소드 종료
        }
        this.balance += money;

    }

    //출금
    public void withdraw(int money) {
        if (money < 1) {
            return;
        }
        if (this.balance - money < -LIMIT_BALANCE) {
            System.out.println("잔액 한도초과 : " + LIMIT_BALANCE + " 까지입니다.");
            return;
        }
        this.balance -= money;

    }


    @Override
    public String toString() {
        return "계좌[" +
                "예금주='" + name + '\'' +
                ", 잔고=" + balance +
                ']';
    }
}
