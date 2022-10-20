/*
  변수와 상수변수의 차이점과 용도
*/
public class Test1 {
    public static void main(String[] args) {
        int x; //변수선언
        x = 10; //값 할당, 초기화

        x = 20;  // 값 재할당.
        System.out.println("x = " + x);

        final int Y = 30; //대문자. 상수변수는 값 재할당 불가능.
        System.out.println("Y = " + Y);


    }
}
