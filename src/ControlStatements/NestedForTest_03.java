package ControlStatements;
import java.util.Scanner;

public class NestedForTest_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        System.out.print("정수 n 입력 : ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            int sum = 0;
            for (int j = 1; j<=i; j++) {
                sum += j;
            }
            total += sum;
        }
        System.out.printf("1 + (1+2) + (1+2+3) + ... + (1+2+3+...+%d) = %d",n,total);
    }
}
