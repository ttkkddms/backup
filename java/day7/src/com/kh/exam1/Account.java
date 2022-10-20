package com.kh.exam1;

public class Account {
    private String name; //예금주
    private int deposit; //잔고

    public Account() {
    }
    public Account(String name, int deposit) {
        this.name = name;
        this.deposit = deposit;
    }
    public Account(String name) { //이름만
        this.name = name;
    }
    public Account(int deposit) { //잔고만
        this.deposit = deposit;
    }



    //접근자 메소드
    public String showName() { //이름을 보여준다
        return (name);
    }

    public int showDeposit() { //잔고를 보여준다
        return (deposit);
    }


    // 변경자 메소드
    public void changeName(String name) {   //이름 변경
        this.name = name;
    }

    public void changeDeposit(int deposit) {   //잔고변경
        this.deposit = deposit;
    }



    public void putDeposit(int some) {   //입금 후 금액, 메인에서 입력
        this.deposit += some;
    }

    public void withdrawDeposit(int some) {   //출금 후 금액
        this.deposit -= some;
    }

    @Override
    public String toString() {
        String str = "";
        str += "예금주 : " + this.showName() + "\n";
        str += "잔고 : " + this.showDeposit() + "\n";
        return str;
    }

}

//잔고  - 일때
//기본계좌 생성자 이름.