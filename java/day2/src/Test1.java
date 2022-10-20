public class Test1 {
    public static void method2() {
        System.out.println("method2호출됨!");
        method3();//method2(); 재귀호출
    }
    public static void method1() {
        System.out.println("method1호출됨!");
    }
    public static void method3() {
        System.out.println("method3호출됨!");

    }

    public static void main(String[] args) {
        System.out.println("hello~");
        method2(); //메소드 호출
        method1();
    }
}
/*호출순서 - 메인 실행 후 메소드 */