/*
* <변수의 생명주기>
* 동일블럭 내 동일이름의 변수선언 불가
* 변수가 선언 된 블럭 내.
* 외부블럭에 선언된 변수는 내부블럭에서 접근 가능.
* 내부선언 변수는 외부블럭에서 접근 불가능.
* */
public class Test2 {
    public static void main(String[] args) {
        int x = 10;
        //int x ;  // 동일 블럭 내에 동일한 이름의 변수 선언 불가
        {
            //int x = 5;  // 안쪽 블럭에 동일한 이름의 변수 선언 불가
            int y = 5;
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
        method1(x);
//        System.out.println("y = " + y);

/*        for (int x = 2; i < 10; i++) {

        }       */
    }

    public static void method1(int x) { // 호출되어야 출력 됨. 위에 메소드에서 x = 10 값으로 초기화. 겹쳐서 오류.
        //int x = 20;
        int y = 20;
        System.out.println("x = " + x);
    }
}
