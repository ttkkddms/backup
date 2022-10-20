public class ForEaxm {
    public static void main(String[] args) {
        int sum = 0;

/*        for (초기값; 조건식; 증감식) {
            실행문;
        }*/
// i = i+1, i+=1, i++, ++i 1씩 증가하는 표현식
        for (int i = 0; i <= 100; i=i+2) { //짝수 합
            sum += i; //sum = sum + i;
        }
        System.out.println(sum);

         sum = 0;
        for (int i = 1; i <= 100; i++) {  //짝수 합
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

