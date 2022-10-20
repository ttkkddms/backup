
// 배열 : 하나의 변수로 여러개의 값을 메모리 연속공간에 저장할 수 있는 자료구조
// 배열요소 : 베열에 저장된 값 하나하나.
// 배열요소 접근방법 : 배열변수이름[인덱스]

// 배열선언 : 타입[] 변수이름; - int[] a;
// 배열생성 : 변수이름 = new 타입[요소의 크기]; a = new int[]
// int[] a = new int[3]

public class ArrayTest1 {
    public static void main(String[] args) {

//      int[] subject; // 배열 선언   초기값 0
//      subject = new int[3]; //배열 생성
        int[] subject = new int[3];
//      int subject[] = new int[3];

        System.out.println(subject[0]);
        System.out.println(subject[1]);
        System.out.println(subject[2]);

        double[] subject2; // 배열 선언   초기값 0.0
        subject2 = new double[3];
        System.out.println(subject2[0]);
        System.out.println(subject2[1]);
        System.out.println(subject2[2]);

        boolean[] subject3; // 배열 선언   초기값 false
        subject3 = new boolean[3];
        System.out.println(subject3[0]);
        System.out.println(subject3[1]);
        System.out.println(subject3[2]);

        char[] subject4; // 배열 선언   초기값 '  ' 공백문자
        subject4 = new char[3];
        System.out.println(subject4[0]);
        System.out.println(subject4[1]);
        System.out.println(subject4[2]);

        String[] subject5; // 배열 선언  참조타입은 초기값 null
        subject5 = new String[3];
        System.out.println(subject5[0]);
        System.out.println(subject5[1]);
        System.out.println(subject5[2]);
    }
}
