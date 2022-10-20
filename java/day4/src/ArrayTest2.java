public class ArrayTest2 {
    public static void main(String[] args) {
        //디폴트값을 원하는 값으로 초기화해서 배열 생성하기

        int[] subject = new int[]{70, 80, 90}; //요소 갯수만큼 자동으로 방 만들어짐.
//      int[] subject = null;
//      subject = new int[]{70, 80, 90}; 분리가능. 권장하는 형태
        System.out.println(subject[0]);
        System.out.println(subject[1]);
        System.out.println(subject[2]);


        int[] subject2 = {70, 80, 90}; //배열선언과 생성 분리 불가능.
        //      int[] subject = null;
        System.out.println(subject2[2]);
        System.out.println(subject2[2]);
        System.out.println(subject2[2]);
    }
}
