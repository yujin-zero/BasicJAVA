package Arrays;

public class BubbleSortTest_01 {
    public static void main(String[] args) {
        int score [] = {3,4,1,5,2,1,4,8,9};

        printResult(score);
        System.out.println();

        sortData(score);
        printResult(score);
    }

    private static void sortData(int [] score) {
        for(int i=0; i<score.length-1; i++) {
            for(int j=1; j<score.length; j++) {
                if(score[j-1] > score[j]) {
                    int temp;
                    temp = score[j-1];
                    score[j-1] = score[j];
                    score[j] = temp;
                }
            }
        }
    }

    private static void printResult(int score []) {
        for (int i = 0; i < score.length; i++) {
            System.out.printf("%d ",score[i]);
        }
    }

}
