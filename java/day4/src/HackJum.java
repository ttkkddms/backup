public class HackJum {
    public static void main(String[] args) {

//      case 1
//      int[] subject = new int[3];
//      subject[0] = 82;
//      subject[1] = 73;
//      subject[2] = 65;

//       case 2
//       int[] subject = new int[]{82, 73, 65};

        //case 3
        int[] subject = {80, 90, 40, 30};

        int sum = 0;
        double average = 0.0;

        //총점
        for (int i = 0; i < subject.length; i++) {
            sum += subject[i];
        }
        //평균
        average = sum / (double) subject.length;

        System.out.println("총점 = " + sum);
        System.out.println("평균 = " + average);
    }
}
