import java.util.WeakHashMap;

public class SumOfOneToTen {
    public static void main(String[] args) {
        final int Nunber = 10;
        System.out.println("for문] 1~" + Nunber + "합 = " + sumByFor(Nunber));
        System.out.println("while문] 1~" + Nunber + "합 = " + sumByWhile(Nunber));
        System.out.println("do~While문] 1~" + Nunber + "합 = " + sumByDoWhile(Nunber));
    }

    public static int sumByFor(int end) {
        int sum = 0;
        for (int i = 1; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumByWhile(int end) {
        int sum = 0;
        int i = 0;
        while (i <= end) {
            sum += i;
            i++;
        }
        return sum;
    }

    public static int sumByDoWhile(int end) {
        int sum = 0;
        int i = 0;
        do {
            sum += i;
            i++;
        } while (i <= end);
        return sum;
    }
}
