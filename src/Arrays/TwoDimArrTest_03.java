package Arrays;

public class TwoDimArrTest_03 {
    public static void main(String[] args) {
        int twoDimArr [][] = new int [5][5];
        for (int i=0; i< twoDimArr.length; i++) {
            int k=0;
            for(int j=i; j<twoDimArr[i].length; j++) {
                ++k;
                twoDimArr[i][j] = k;
            }
        }

        for (int i=0; i< twoDimArr.length; i++) {
            for (int j=0; j<twoDimArr[i].length; j++) {
                System.out.printf("%3d",twoDimArr[i][j]);
            }
            System.out.println();
        }
    }
}
