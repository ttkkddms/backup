/*
    소스파일 : Hello2.java
    중간코드 : Hello.class
    작성자 : 홍길동
    작성일 : 2020.05.10
    = 대입, 오른쪽부터 해석
    == 같다
    shift + 엔터
    shift + crtl + /
*/
public class Hello2 {
    // 두개 변수의 합구하기
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        int sum = x / y; //산술연산자 : +, -, *, /
        System.out.println(sum);


        double result = divide(30, 5); //숫자만 입력. x,y 자동으로 들어옴.
        System.out.println("main메소드에서 출력 :" + result);

        double result2 = divide(100, 10);
        System.out.println("main메소드에서 출력 :" + result2);
    }

    public static double divide(double x, double y){
        //System.out.println(x/y);
        double result = x / y;  //메인메소드의 result 위해서 반복사용 가능.
        return result;
    }
}
