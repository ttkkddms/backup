public class IfExam {
    public static void main(String[] args){
        int num = 10;

        //산술연산 : +,-,*,/,%(나머지)
        System.out.println(num % 2);

        //비교언산자 : 크다(>), 작다(<), 같다(==), 같지않다(!=), 이상(>=), 이하(<=). 결과는 논리형값(true, false)

        if ((num % 2) == 1) {  //true
            System.out.println("홀수");
        } else {
            System.out.println("짝수");
        }
    }
}
