import java.util.Scanner;

public class SwitchScore {
    public static void main(String[] args) {
        //int score = 101;

        Scanner scanner = new Scanner(System.in);
        System.out.println("<<학점구하기 'Q'를 입력하면 종료합니다.>>");
        boolean stop = false;

        while (!stop) {
            System.out.print("점수를 입력하세요 : ");
            String input = scanner.nextLine();

            if (input.equals("Q")) {
                System.out.println("종료합니다.");
                System.exit(0);
            }
            int score = Integer.parseInt(input); //문자열을 정수로 변환

            if (!(score >= 0 && score <= 100)) {  //== (score < 0 || score > 100) 유효성 체크
                System.out.println("점수 유효범위(0~100)을 초과합니다.");
                continue;  //return; 하면 끝남.
            }

            int result = score / 10;
            switch (result) {
                case 9:
                case 10:
                    System.out.println("A학점");
                    break;
                case 8:
                    System.out.println("B학점");
                    break;
                case 7:
                    System.out.println("C학점");
                    break;
                case 6:
                    System.out.println("D학점");
                    break;
                default: //60미만
                    System.out.println("F학점");
            }
        }
    }
}