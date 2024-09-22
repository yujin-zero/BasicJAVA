package Arrays;
import java.util.Scanner;

public class OneDimTest_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score [] = new int[20];
        int i=0, count=0, sum=0;
        double average;
        System.out.println("점수 입력");
        do {
            System.out.print("배열 ["+ i + "] 번째 = ");
            int x = sc.nextInt();
            if (x<0) break;
            score[i]=x;
            i++;
            count++;
        } while (true);

        System.out.println("입력된 값 출력");
        for (i=0; i<count; i++) {
            System.out.printf("score [%d] = %d\n",i,score[i]);
        }

        i=0;
        while (i < count) {
            sum += score[i];
            i++;
        }
        average = (double)sum/count;
        System.out.printf("총점 = %d, 평균 = %.2f\n",sum,average);
    }
}
