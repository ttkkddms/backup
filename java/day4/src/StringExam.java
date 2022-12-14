


// 문자열 생성방법 2가지 : 문자열 리터럴, String 클래스 사용
// 문자열 리터럴 - 같은 문자있으면 새로 생성하지 않는다.
// new String - 문자열 리터럴 풀에 무조건 새로 생성.
// '==' : 기본타입인 경우 값비교, 참조타입인 경우 주소값(힙메모리 번지) 비교
// 문자열 비교는 문자열 객체의 equal()메소드 사용



public class StringExam {
    public static void main(String[] args) {
        String a = "방가";
        String b = new String("방가");
        String c = "방가";
        String d = new String("방가");
        String e = "방가";
        String f = new String("방가");


        //문자열 비교는 ==,equals
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == d);
        System.out.println(a == e);
        System.out.println(a == f);
        System.out.println();

        System.out.println(b == c);
        System.out.println(b == d);
        System.out.println(b == e);
        System.out.println(b == f);
        System.out.println();

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));
        System.out.println(a.equals(e));
        System.out.println(a.equals(f));

    }
}
