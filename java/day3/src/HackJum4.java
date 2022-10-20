import java.util.Scanner;

public class HackJum4 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in); //import호출, 객체생성
        System.out.println("<<3개의 과목을 입력받아 총점/평균 구하는 프로그램>>");

        System.out.print("국어 : ");
        String input1 = scanner.nextLine();
        int kor = Integer.parseInt(input1);

        System.out.print("영어 : ");
        String input2 = scanner.nextLine();
        int eng = Integer.parseInt(input2);

        System.out.print("수학 : ");
        String input3 = scanner.nextLine();
        int math = Integer.parseInt(input3);


        int sum = 0;
        double average = 0.0;

        sum = total(kor, eng, math);
        average = getAverage(sum, 3);

        System.out.println("총점 = " + sum);
        System.out.println("평균 = " + average);

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

