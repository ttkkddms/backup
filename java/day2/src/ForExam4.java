public class ForExam4 {
    public static void main(String[] args) {

        for (int i = 2; i < 5; i++) { //1, 4, 3 번 실행
            for (int j = 1; j <= 3; j++) { //3, 12, 9번 실행
                System.out.println(i + "*" + j + "=" + (i * j));
            }
        }
    }
}
