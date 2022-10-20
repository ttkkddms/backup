public class MaxValue {
    public static void main(String[] args) {
        int x = 6;
        int y = 5;
        int z = 4;

        int maxValue = x;

        if(y>maxValue){
            maxValue = y;
        }
        if(z>maxValue){
            maxValue = z;
        }
        System.out.println("최대값출력");
        System.out.println(maxValue);
    }
}

