public class SwitchExam {
    public static void main(String[] args) {

        int num = 3;
        //switch문에서 case문으로 실행 후 break문을 만날때까지 순차적으로 실행된다.
        switch (num % 2) {
            case 1:   //위치값이 1일 때
                System.out.println("홀수");
                //break; // 가장 가까운 중괄호를 빠져나옴.
            case 0:
                System.out.println("짝수");
                //break;
        }
    }
}
