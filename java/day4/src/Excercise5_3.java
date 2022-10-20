import java.util.Arrays;

public class Excercise5_3 {
    public static void main(String[] args) {
        double[] a = {1.2, 3.4, 5.6};
        double[] b = a;
        b[0] = 7.8;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
