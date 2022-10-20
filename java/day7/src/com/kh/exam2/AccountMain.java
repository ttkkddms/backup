package com.kh.exam2;

public class AccountMain {
    public static void main(String[] args) {
        Account account1 = new Account("정상은");
        System.out.println(account1);

        account1.deposit(10000); //입금
        System.out.println(account1);

        account1.deposit(10000); //입금
        System.out.println(account1);

        account1.withdraw(5000); //출금
        System.out.println(account1);

        account1.withdraw(20000);
        System.out.println(account1);


        System.out.println(account1.getBalance());

    }

}
