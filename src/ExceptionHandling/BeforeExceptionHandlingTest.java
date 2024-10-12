package ExceptionHandling;
import java.util.Scanner;

public class BeforeExceptionHandlingTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numer, denom, result;

        // 예외 처리 하기 전
        System.out.print("분자 입력 : ");
        numer = sc.nextInt();
        System.out.print("분모 입력 : ");
        denom = sc.nextInt();
        result = numer / denom; // 나눗셈에서 분모가 0인 경우 주의
        System.out.printf("%d / %d = %d",numer,denom,result);
    }
}
