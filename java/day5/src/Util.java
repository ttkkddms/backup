public class Util { // 라이브러리 클래스 : 메인메소드를 포함하고 있지 않는 클래스.
    //배열 내 중복값 있는지 체크

    //static 없는 형태는 Util util = new Util(); 넣어줘야함.
    public boolean isExist(int[] arr, int num) {
        boolean result = false; // false 일 때 종료

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                result = true;
                break;
            }
        }
        return result;
    }

    //static 붙어있으면 직접접근가능.
    public static void printLine(char ch, int count){
        for (int i = 0; i < count; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
