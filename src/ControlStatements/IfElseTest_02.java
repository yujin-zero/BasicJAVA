package ControlStatements;
import java.util.Scanner;

public class IfElseTest_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("성별 입력 남성(M) 여성(F) : ");
        String sex = in.next();

        if (sex.equalsIgnoreCase("M")) {
            System.out.println("당신은 남성입니다.");
            System.out.printf("입력된 값 : %s\n",sex);
        } else {
            System.out.println("당신은 여성입니다.");
            System.out.printf("입력된 값 : %s\n",sex);
        }
    }
}
