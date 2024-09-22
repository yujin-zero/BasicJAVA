package Methods;
import java.util.Scanner;

public class RecursionTest_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 피보나치 구하기
        System.out.print("정수 n : ");
        int n = sc.nextInt();

        for (int count = 1; count <= n; count++) {
            System.out.println(fib(count));
        }
    }

    private static long fib(int n) {
        long f;
        f = (n <= 2) ? 1 : fib(n-1) + fib(n-2);
        return f;
    }
}
