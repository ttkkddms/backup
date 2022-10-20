public class Excercise4_6_1 {
    public static void main(String[] args) {
        out:
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 5; j++) {

                if (i == 3 && j == 2) {
                    break out;

                }System.out.println(i);
            }
        }

    }
}
