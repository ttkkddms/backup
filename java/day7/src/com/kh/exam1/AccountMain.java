package com.kh.exam1;

public class AccountMain {
    public static void main(String[] args) {
        Account account1 = new Account("정상은", 5000);
        System.out.println(account1);


        account1.changeName("정상은");
        account1.changeDeposit(800);

        Account account2 = new Account();
        account2.changeName("해리");   //이름변경
        account2.changeDeposit(10000);   //잔고 변경
        System.out.println(account2);

        account2.putDeposit(5000);//입금
        account2.withdrawDeposit(2000);  //출금

        System.out.println(account1);
        System.out.println(account2);
    }
}