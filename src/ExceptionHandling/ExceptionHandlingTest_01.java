package ExceptionHandling;
import java.util.Scanner;

public class ExceptionHandlingTest_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int numer, denom, result;
            System.out.print("분자 입력 : ");
            numer = sc.nextInt();
            System.out.print("분모 입력 : ");
            denom = sc.nextInt();
            result = numer / denom; // 나눗셈에서 분모가 0인 경우
            // DivideByZeroException 오류 발생
            System.out.printf("%d / %d = %d",numer,denom,result);
        }
        catch (ArithmeticException de) { // 분모가 0인 경우
            System.out.println("분자를 0으로 나누려 함");
            System.out.println("Message : " + de.getMessage());
            de.printStackTrace();
        }
        catch (Exception fe) { // 분자 또는 분모가 숫자가 아닌 경우
            System.out.println("정수가 아닌 값을 입력함");
            System.out.println("Message : " + fe.getMessage());
            fe.printStackTrace();
        }
        finally { // 이 문장은 반드시 수행
            System.out.println("finally 문장은 반드시 수행");
        }
    }
}
