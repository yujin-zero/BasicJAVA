package Arrays;

public class ArratAppTest_01 {
    public static void main(String[] args) {
        int x[][] = {
                {7,1,5,2,0,0},
                {6,7,8,9,0,0},
                {1,2,3,5,0,0},
                {6,2,8,9,0,0},
                {3,3,4,5,0,0}
        };

        sumArray(x);
        printResult(x);
        System.out.println();

        arraySort(x);
        printResult(x);
        System.out.println();

        rankCal(x);
        printResult(x);
    }

    private static void sumArray(int[][] x) {
        for (int i=0; i<x.length; i++) {
            int sum = 0;
            for (int j=0; j<x[i].length; j++) {
                sum += x[i][j];
            }
            x[i][4] = sum;
        }
    }

    private static void arraySort(int[][] x) {
        for (int i=0; i<x.length; i++) {
            for (int j=i+1; j<x[i].length-1; j++) {
                if (x[i][4] < x[j][4]) {
                    for (int k=0; k<6; k++) {
                        swap(x,i,j,k);
                    }
                }
            }
        }
    }

    private static void swap(int[][] x, int i,int j, int k) {
        int temp = x[j][k];
        x[j][k] = x[i][k];
        x[i][k] = temp;
    }

    private static void rankCal(int [][] x) {
        int t = 1;
        x[0][5] = t;
        for (int i=0; i< x.length-1; i++) {
            t++;
            if (x[i][4] == x[i+1][4]) {
                x[i+1][5] = x[i][5];
            } else {
                x[i+1][5] = t;
            }
        }
    }

    private static void printResult(int[][] x) {
        for (int i=0; i<x.length; i++) {
            for (int j=0; j<x[i].length; j++) {
                System.out.printf("%3d",x[i][j]);
            }
            System.out.println();
        }
    }
}
