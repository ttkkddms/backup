public class Operate {
    public static void main(String[] args) {
        int x = 10;

        //대입 연산자 : =,  산술연산자=

        x = x + 1; //오른쪽 먼저계산. ==  x += 1
        System.out.println(x);  // 11

        x += 1;
        System.out.println(x);  // 12

        x-= 1;  // x = x -1
        System.out.println(x);  // 11

        x *= 2;  //x = x * 2
        System.out.println(x); // 22

        x /= 2;  //  x = x / 2
        System.out.println(x);  //  11

        x %= 2;  //  x = x % 2
        System.out.println(x); //  1
    }
}
