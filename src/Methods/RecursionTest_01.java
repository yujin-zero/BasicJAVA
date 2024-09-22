package Methods;
import java.util.Scanner;

public class RecursionTest_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            long retValue = factorial(i);
            System.out.printf("%d! = %d\n",i,retValue);
        }
    }

    private static long factorial(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
