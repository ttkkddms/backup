import java.util.Scanner;

public class HackJum8 {
    public static void main(String[] args) {

        boolean stop = false;
        System.out.println("<<3개의 과목을 입력받아 총점/평균 구하는 프로그램>>");
        System.out.println("Q 또는 q를 입력시 종료합니다.");

        while (!stop) {
            int kor = inputValue("국어");
            if (kor == -1) {
                System.out.println("종료.");
                stop = true;
                continue;
            }
            int eng = inputValue("영어");
            if (eng == -1) {
                stop = true;
                continue;
            }
            int math = inputValue("수학");
            if (math == -1) {
                stop = true;
                continue;
            }

            int sum = 0;
            double average = 0.0;

            sum = total(kor, eng, math);
            average = getAverage(sum, 3);

            System.out.println("총점 = " + sum);
            System.out.println("평균 = " + average);
        }
    }
    public static int inputValue(String title) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(title + " 점수>> ");
        String input = scanner.nextLine();

        if (input.equals("Q") || input.equals("q")) {
            System.out.println("종료!");
            System.exit(1);
        }

        int score =  Integer.parseInt(input);
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

