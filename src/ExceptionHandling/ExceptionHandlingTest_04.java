package ExceptionHandling;
import java.util.Scanner;

public class ExceptionHandlingTest_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("첫번째 숫자 입력 : ");
        num1 = sc.nextInt();
        System.out.print("두번째 숫자 입력 : ");
        num2 = sc.nextInt();

        try {
            int sum = add(num1,num2);
            System.out.printf("\n결과 = %d",sum);
        }
        catch (Exception ex) {
            System.out.println("Message : " + ex.getMessage());
            ex.printStackTrace(); // 예외가 발생한 시점에서의 호출 스택을 출력
        }
    }

    public static int add(int num1, int num2) throws NegativeNumberFoundsException {
        if (num1 < 0 || num2 < 0) {
            throw new NegativeNumberFoundsException("num1 또는 num2가 음수 입력");
        }
        return (num1 + num2);
    }
}
