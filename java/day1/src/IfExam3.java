public class IfExam3 {
    public static void main(String[] args) {
        //boolean flag = true;
        int number = 5;

        if (is0dd(number)) {  //true면 출력
            System.out.println("홀수입니다");
        } else {
            System.out.println("짝수입니다");
        }
    }
    //홀수면 true, 짝수명 false를 반환하는 메소드
    public static boolean is0dd(int num) {
        boolean result = false; //기본조건인가?

        //단순if문
        if(num % 2 == 1) {
            result = true;
        }
        return result;
    }
}
