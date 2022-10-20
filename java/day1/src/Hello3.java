public class Hello3 {
    public static void main(String[] args) {
        int x; //변수선언
//      System.out.println(x);  지역변수는 초기화 후에 접근 가능.

        x = 10; //값 할당=초기화, 변수선언 이후 최초값.
        System.out.println(x);

        int y = 20; //선언과 할당 한번에

        x = 30; //재할당(초기화 아님)
        System.out.println(x);

        int sum = x + y; //x,y값을 산술연산 후 sum변수에 할당
        System.out.println(sum);

        int result = calculate(3, 5);  //초기화, 메소드 호출결과를 변수에 할당
        System.out.println(result);

        int bb = calculate(10, 5);  //bb는 변수명일 뿐. calculate도 마찬가지. 같기만 하면 됨. int는 같아야.
        System.out.println(bb);
    } //메소드 안의 변수를 지역변수라고 함.

    public static int calculate(int x, int y) { //매개변수
        int result = x * y; //지역변수
        return result;  //return(반환문) : 메소드를 종료하고 반환값 반환, 값이나 식, 아무것도 안올 때도 있음.
    }

}