/*
    Math.random() : 0 <= ? < 1 사이의 랜덤한 실수 발생
*/

import java.util.Arrays;
// 로또 구현하기
// : 1~45번 번호중 중복되지 않는 6자리 추출하기
public class RandomExam3 {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        int count = 0;

        int i = 0;
        while (i < lotto.length) {
            int num = (int) (Math.floor(Math.random() * 45) + 1);
            count++;

            //동일 번호가 존재하면
            if (isExist(lotto, num)) { //다르다면 완료니까.
                i--;
                continue;
            }
//            lotto[i] = num;
//            i++;
            lotto[i++] = num;
        }

        System.out.println("for문 반복횟수 : "+count);
        System.out.println(Arrays.toString(lotto));
    }

    //배열 내 중복값 있는지 체크
    public static boolean isExist(int[] arr, int num) {
        boolean result = false; // false 일 때 종료

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                result = true;
                break;
            }
        }
        return result;
    }
}