import java.util.Scanner;

public class Gugudan2 {
    public static void main(String[] args) {
        boolean stop = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println(">> 구구단을 출력하는 프로그램 <<");

        while (!stop) {

            System.out.print("출력하고자하는 구구단을 입력하세요. [Q]:종료 >> ");
            String input = scanner.nextLine(); //키보드로부터 엔터칠때까지 입력된 값을 문자열로 반환

            if (input.equals("Q")) { //문자열비교 equals()사용
                System.out.println("종료!");
                stop = true;
                continue;//조건식으로 이동
                //break; // break문에서 가장 가까운 반복문을 빠져나온다. while!
            }

            int gugudan = Integer.parseInt(input);

            for (int i = 1; i <= 9; i++) {
                System.out.println(gugudan + "*" + i + " = " + (gugudan * i));
            }
        }
    }
}
