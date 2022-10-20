public class HackJum2 {
    public static void main(String[] args) {

        int kor = 82;
        int eng = 73;
        int math = 65;

        int sum = 0;
        double average = 0.0;

        sum = total(kor, eng, math);
        average = getAverage(sum, 3);

        System.out.println("총점 = " + sum);
        System.out.println("평균 = "+ average);

        System.out.println(total(1,3,4));
        System.out.println(getAverage(1,3));

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

