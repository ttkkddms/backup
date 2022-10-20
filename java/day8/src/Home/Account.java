package Home;

public class Account {

    private String name; //예금주
    private long balance; //잔고
    private final int LIMIT_MONEY_ONETIME = 100000; //1회 입금 한도
    private final int LIMIT_BALANCE = -1000000; // 출금한도

    public Account(String name) {
        this.name = name;
    }

    //입금
    public void deposit(int money) {
        if (money < 0 || money > LIMIT_MONEY_ONETIME) {
            System.out.println("입금오류 : 1회 입금한도는 "+LIMIT_MONEY_ONETIME+"원 입니다.");
            return;
        }this.balance += money;
    }

    //출금
    public void withdraw(int money) {
        if (money < 1 || balance - money < LIMIT_BALANCE) {
            System.out.println("출금오류 : 마이너스 한도는 " + LIMIT_BALANCE + "원 입니다.");
            return;
        }
        this.balance -= money;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

}
