public class SumOfOneToTen2 {
    public static void main(String[] args) {
        final int Nunber = 100;
        System.out.println("while문] 1~" + Nunber + "합 = " + sumByWhile(Nunber));
        System.out.println("do~While문] 1~" + Nunber + "합 = " + sumByDoWhile(Nunber));
    }

    public static int sumByWhile(int end) {
        int sum = 0;
        int count = 0;
        boolean stop = false;
        while (!stop) {
//            count++;
//            sum += count;
            sum += ++count; //위에 두개 합친 것과 같다.
            if (count == end) {
                stop = true;
                continue;
            }
            //실행문;
        }
        return sum;
    }

    public static int sumByDoWhile(int end) {
        int sum = 0;
        int count = 0;
        boolean stop = false;
        do {
//            count++;
//            sum += count;
            sum += ++count; // sum = sum + (++count); count 1부터 더해짐.
                if (count == end) {
                    stop = true;
                    continue;
                }
                //실행문;
            }
            while (!stop);
            return sum;
        }
}
