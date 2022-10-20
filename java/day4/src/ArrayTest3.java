public class ArrayTest3 {
    public static void main(String[] args) {

        //배열 요소 값을 0으로 초기화
        int[] subject = new int[3];

        //배열 요소값을 재할당
        subject[0] = 80;
        subject[1] = 70;
        subject[2] = 50;
        System.out.println(subject[0]);
        System.out.println(subject[1]);
        System.out.println(subject[2]);

        System.out.println(subject.length); //subject가 가지고있는 방의 수 출력. 3


        for (int i = 0; i < 3; i++) { //방 크기를 알 때. 3
            System.out.println(subject[i]);
        }
        for (int i = 0; i < subject.length; i++) {  //legnth이용.
            System.out.println(subject[i]);
        }


    }
}
