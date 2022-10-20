import java.util.Scanner;

public class HackJum6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean stop = false;
        System.out.println("<<3개의 과목을 입력받아 총점/평균 구하는 프로그램>>");

        while (!stop) {
            int kor = inputValue("국어");
            int eng = inputValue("영어");
            int math = inputValue("수학");

            int sum = 0;
            double average = 0.0;

            sum = total(kor, eng, math);
            average = getAverage(sum, 3);

            System.out.println("총점 = " + sum);
            System.out.println("평균 = " + average);

            System.out.print("Q 또는 q를 입력하면 종료합니다 : ");
            String inputValue = scanner.nextLine();
            if (inputValue.equals("Q") || inputValue.equals("q")) {
                System.out.println("종료합니다.");
                System.exit(0);
            }

        }
    }

    public static int inputValue(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(title + " 점수>>");
        int score =  Integer.parseInt(scanner.nextLine());
        return score;
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

