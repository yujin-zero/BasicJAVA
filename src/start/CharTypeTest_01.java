package start;

import java.io.IOException;
import java.util.Scanner;
public class CharTypeTest_01 {
    public static void main(String[] args) throws IOException {
        System.out.print("문자 입력 : ");
        int oneChar = System.in.read();
        System.out.printf("입력된 문자 : %c",oneChar);
        System.out.println();

        int i = (int)oneChar; // 입력된 문자의 아스키 코드값으로 변환
        System.out.printf("입력된 문자의 ASCII Code 값: %d\n",i);

        Scanner sc = new Scanner(System.in);
        System.out.print("ASCII 코드 값 입력 : ");
        int asCode = sc.nextInt();
        System.out.printf("입력된 아스키 코드 값 : %d, 이 코드에 해당하는 문자 : %c",asCode,(char)asCode);
    }
}
