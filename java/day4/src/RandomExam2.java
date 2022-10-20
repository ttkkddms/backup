/*
    Math.random() : 0 <= ? < 1 사이의 랜덤한 실수 발생
*/

import java.util.Arrays;

// 로또 구현하기
// : 1~45번 번호중 중복되지 않는 6자리 추출하기

public class RandomExam2 {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        System.out.println(Arrays.toString(lotto)); //0 0 0 0 0 0 초기화.

        int count = 0;
        for (int i = 0; i < lotto.length; i++) {
            int num = (int) (Math.floor(Math.random() * 45) + 1);
            count++; //count = count + 1, count += 1

            //동일 번호가 존재하면
            if (isExist(lotto, num)) { //조건식 값. boolean형이라면 t ot f, 변수, 불린형태연산식.
                                        //표현식. 하나의 값으로 평가되는 식.(메소드호출 or 불린형태연산식, 불린형변수, t f값)
                i--; // i -= 1
                continue; //for문으로 이동
            }
            lotto[i] = num; //0~5값.
        }
        System.out.println("for문 반복횟수 : "+count);
        System.out.println(Arrays.toString(lotto));

        System.out.println();
    }

    //배열 내 중복값 있는지 체크
    public static boolean isExist(int[] arr, int num) {
        boolean result = false; // false 일 때 실행.

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) { //같으면 true.
                result = true;
                break; //for문을 빠져나감.
            }
        } // result가 true가 되었고
        return result; //true값을 불린에 반환. 불린종료.
    }
}

//lotto[0]~lotto[5]