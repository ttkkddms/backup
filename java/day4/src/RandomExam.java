/*
    Math.random() : 0 <= ? < 1 사이의 랜덤한 실수 발생
*/
import java.util.Arrays;

// 로또 구현하기
// : 1~45번 번호중 중복되지 않는 6자리 추출하기

public class RandomExam {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        System.out.println(Arrays.toString(lotto)); //0 0 0 0 0 0 초기화.

        for (int i = 0; i < lotto.length; i++) {
            int num = (int) (Math.floor(Math.random() * 45) + 1);
            lotto[i] = num;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) { //같으면 배제하기위해 i값 줄여서 다시 돌려보냄.
                    i--; //같은 배열 배제 다시 i값으로 시작.
                }
            }
        }
        System.out.println(Arrays.toString(lotto));
    }
}

//lotto[0]~lotto[5]