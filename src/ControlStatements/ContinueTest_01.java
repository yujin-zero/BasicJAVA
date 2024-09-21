package ControlStatements;
import java.util.Scanner;

public class ContinueTest_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0){
                sum += i;
                System.out.printf("%d 인 경우는 3의 배수로 합에 누적\n",i);
            }
            else {
                System.out.printf("정수 %d 는 3의 배수가 아님\n",i);
                continue;
            }
        }
        System.out.printf("1에서 %d 까지의 정수 중 3의 배수의 합 = %d",n,sum);
    }
}
