public class ArrayTest5 {
    public static void main(String[] args) {

        //1차원배열에 디폴트값을 주어 초기화하기
        int[] x = new int[]{1, 2, 3};
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }

        //2차원배열에 디폴트값을 주어 초기화하기
        int[][] y = new int[][]{ //[2][3]
                {1, 2, 3},
                {3, 4, 5}
        };
        //2차원 배열요소 출력하기
        for (int i = 0; i < y.length; i++) {//2바퀴
            for (int j = 0; j < y[i].length; j++) { //3바퀴
                System.out.println("y[" + i + "][" + j + "] = " + y[i][j]);
            }
        } //i 생명주기 끝.


        //3차
        int[][][] z = new int[][][]{
            {
                {1}, {2}, {3}
            },
            {
                {3}, {4}, {5}
            }
        };

        for (int i = 0; i < z.length; i++) { //1
            for (int j = 0; j < z[i].length; j++) { //2
                for (int k = 0; k < z[i][j].length; k++) {  //3
                    System.out.println("k[" + i + "][" + j + "][" + k + "] = " + z[i][j][k]);
                }
            }
        }



    }
}

