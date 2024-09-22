package Methods;
import java.util.Scanner;

public class MethodTest_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 x : ");
        int x = sc.nextInt();
        System.out.print("정수 y : ");
        int y = sc.nextInt();

        boolean result = compareTwoInteger(x,y);
        printSum(result);
    }

    private static boolean compareTwoInteger(int x, int y) {
        if (x>y)
            return true;
        else
            return false;
    }

    private static void printSum(boolean result) {
        System.out.printf("두 정수의 비교 결과 = %b", result);
    }
}
