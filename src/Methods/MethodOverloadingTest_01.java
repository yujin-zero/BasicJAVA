package Methods;
import java.util.Scanner;

public class MethodOverloadingTest_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        int twoNumberAdd, threeNumberAdd, fourNumberAdd;

        System.out.print("첫 번째 정수 입력 : ");
        a = sc.nextInt();
        System.out.print("두 번째 정수 입력 : ");
        b = sc.nextInt();
        System.out.print("세 번째 정수 입력 : ");
        c = sc.nextInt();
        System.out.print("네 번째 정수 입력 : ");
        d = sc.nextInt();

        // 메소드 오버로딩 (메소드 중복) : 인수의 갯수가 다른 경우
        twoNumberAdd = addNumbers(a,b);
        threeNumberAdd = addNumbers(a,b,c);
        fourNumberAdd = addNumbers(a,b,c,d);
        System.out.println();

        System.out.printf("두 수의 덧셈 결과 = %d\n",twoNumberAdd);
        System.out.printf("세 수의 덧셈 결과 = %d\n",threeNumberAdd);
        System.out.printf("네 수의 덧셈 결과 = %d\n",fourNumberAdd);

    }

    private static int addNumbers(int a, int b) {
        return a + b;
    }

    private static int addNumbers(int a, int b, int c) {
        return a + b + c;
    }

    private static int addNumbers(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}
