/* 증감연산자 :단독사용시에는 차이없음.
    1. 선위 증감연산자(++i) 자신을 1 증가.감소시킨 후 식에 참여
    2. 후위 증감 연산자(i++) 식에 참여 후 자신을 1 증가.감소시킨다.
 */

public class IncrementOperator {
    public static void main(String[] args) {
        int x = 1;
        int y = x++; //ㅌ값을 y에 대입한 후 x값 1 증가.
        System.out.println("x = " + x + ", y = " + y); //x = 2, y = 1

        int k = 1;
        int l = ++k; //k값을 증가 후 l에 대입.
        System.out.println(("k = " + k + ", l = " + l)); //k = 2, l = 2


        int i = 1;
        i++; //i=i+1
        System.out.println("i = " + i); //i = 2

        int j = 1;
        ++j; //j=j+1
        System.out.println("j = " + j); //j = 2
    }
}
