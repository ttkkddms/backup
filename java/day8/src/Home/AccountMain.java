//package Home;
//
//import java.util.Scanner;
//
//public class AccountMain {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        final int MAX_ACCOUNT = 10;
//        Account account = null;
//        Account[] accounts = new Account[MAX_ACCOUNT];
//        //10개계좌중에
//        //null값 없으면 계좌 다 참
//        //??
//        if(int i=0; )
//
//        int i = 0;
//        int money = 0;
//
//        boolean stop = false;
//        do {
//            if (accounts[i] == null) {
//                System.out.println("[메뉴] 1. 계좌개설 6.계좌현황 7. 종료");
//            } else {
//                System.out.println("메뉴] 1.계좌개설 2.입금 3.출금 4.잔액조회 5.계좌폐지 6.계좌현황 7.종료");
//                System.out.print(">>> ");
//                String menu = scanner.nextLine();
//
//                switch (menu) {
//                    case "1":
//                        for (int x = 0; x < accounts.length; x++) {
//                            if (accounts[x] == null) {
//                                System.out.println("계좌명을 입력하세요.");
//                                System.out.print(">> ");
//                                String accountName = scanner.nextLine();
//                                accounts[x] = new Account(accountName);
//                                System.out.println();
//
//                            }
//                        }
//                        System.out.println("1. 이름을 입력하세요");
//                        System.out.print(">>> ");
//                        String name = scanner.nextLine();
//                        accounts[]
//                        System.out.println(name + "님의 계좌가 생성되었습니다.");
//                        break;
//                    case "2":
//                        if (account == null) {
//                            System.out.println("계좌 미개설 상태입니다.");
//                            continue;
//                        }
//                        System.out.println("2. 입금금액을 입력하세요");
//                        System.out.print(">>> ");
//                        money = Integer.valueOf(scanner.nextLine());
//                        account.deposit(money);
//                        break;
//                    case "3":
//                        if (account == null) {
//                            System.out.println("계좌 미개설 상태입니다.");
//                            continue;
//                        }
//                        System.out.println("3. 출금금액을 입력하세요.");
//                        System.out.print(">>> ");
//                        money = Integer.parseInt(scanner.nextLine());
//                        account.withdraw(money);
//                        break;
//                    case "4":
//                        if (account == null) {
//                            System.out.println("계좌 미개설 상태입니다.");
//                            continue;
//                        } else {
//                            System.out.println("4. 잔액조회");
//                            long balance = account.getBalance();
//                            System.out.println(account.getName() + " 님의 잔액 : " + balance);
//                            break;
//                        }
//                    case "5":
//                        System.out.println("5. 계좌폐지");
//
//
//                    case "6":
//                        System.out.println("6. 계좌현황");
//
//                    case "7":
//                        System.out.println("7. 종료합니다.");
//                        stop = true;
//                        break;
//                    default:
//                }
//            }
//        } while ();
//    }
//}
