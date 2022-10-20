import java.util.Scanner;

public class HackJum3 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("<<3개의 과목을 입력받아 총점/평균 구하는 프로그램>>");

        boolean stop = false;
        while (!stop) {

            System.out.println("<점수를 입력하세요.>");

            System.out.print("국어 : ");
            int kor = Integer.parseInt(scanner.nextLine());

            System.out.print("영어 : ");
            int eng = Integer.parseInt(scanner.nextLine());

            System.out.print("수학 : ");
            int math = Integer.parseInt(scanner.nextLine());

            int sum = 0;
            double average = 0.0;

            sum = total(kor, eng, math);
            average = getAverage(sum, 3);

            System.out.println("총점 = " + sum);
            System.out.println("평균 = " + average);

            System.out.print("계속하려면 엔터, 종료하려면 Q를 입력하세요 : ");
            String input = scanner.nextLine();
            if (input.equals("Q")) {
                System.out.println("종료합니다.");
                System.exit(0);
            }

        }
    }
    //합계
    public static int total(int kor, int eng, int math) {
        int result = kor + eng + math;
        return result;
    }
    //평균
    public static double getAverage(int total, int count) {
        return total / (double)count;
    }
}

