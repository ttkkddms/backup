public class HackJum {
    public static void main(String[] args) {

        int kor = 82;
        int eng = 73;
        int math = 65;

        int sum = 0;  //선언. 초기화. 디폴트값을 넣어서 초기화해놓는게 오류 덜 남.
        double average = 0.0;

        sum =kor+eng+math;

        // average = sum / (double)3;
       // average = (double)sum / 3;
       average = sum / (3 * 1.0);


        System.out.println("총점 = "+sum);
        System.out.println("평균 = "+ average);
    }
}

