package ControlStatements;
import java.util.Scanner;

public class BreakTest_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, cnt = 0;
        while (true) {
            System.out.print("정수 입력 (종료 시 -1 입력) : ");
            int i = sc.nextInt();
            if (i == -1) {
                break;
            } else {
                sum += i;
                cnt++;
            }
        }

        System.out.printf("입력된 갯수 = %d\n",cnt);
        System.out.printf("총 합 = %d",sum);
    }
}
