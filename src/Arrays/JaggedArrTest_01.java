package Arrays;

public class JaggedArrTest_01 {
    public static void main(String[] args) {
        int x [][] = {
                {3,4,5,2},
                {3,4,5},
                {6,7,8,9,10,11},
                {1,2,3,4,5}
        };

        for (int i=0; i<x.length; i++) {
            int sum = 0;
            for (int j=0; j<x[i].length; j++) {
                sum += x[i][j];
                System.out.printf("%3d",x[i][j]);
            }
            System.out.printf("sum = %d\n",sum);
        }
    }
}
