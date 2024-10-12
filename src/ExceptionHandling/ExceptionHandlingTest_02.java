package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandlingTest_02 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        int selection;
        boolean answer = true;
        do {
            System.out.println("\n소프트웨어 CD 관리");
            System.out.print("1. CD 대출");
            System.out.print("2. CD 반납");
            System.out.print("3. 프로그램 종료");

            try {
                selection = inputNumber();
            }
            catch (UserMakeException e) {
                System.out.println(e.toString());
                continue;
            }
            catch (NumberFormatException e) {
                System.out.println(e.toString());
                continue;
            }
            System.out.println();
            switch (selection) {
                case 1 :
                    System.out.println("CD 대출 처리");
                    break;
                case 2 :
                    System.out.println("CD 반납 처리");
                    break;
                case 3 :
                    System.out.println("프로그램 종료");
                    answer = false;
                    break;
            }

        } while(answer);
    }

    public static int inputNumber() throws Exception, UserMakeException {
        System.out.print("번호 선택하세요. [1~3] : ");
        int n = sc.nextInt();
        try {
            if (n < 1 || n > 3) {
                throw new UserMakeException();
            }
        } catch (Exception e) {
            throw e;
        }
        return n;
    }
}
