package ControlStatements;
import java.util.Scanner;

public class ForTest_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("n값 입력 : ");
        int n = sc.nextInt();
        int i = 1;

        for ( ; ; ) {
            if (i > n)
                break;
            else
                sum += i;
            i++;
        }
        System.out.printf("무한루프를 이용하여 1에서 %d 까지의 정수의 합 = %d",n,sum);
    }
}
