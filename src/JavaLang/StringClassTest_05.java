package JavaLang;
import java.util.Arrays;

public class StringClassTest_05 {
    public static void main(String[] args) {
        String intToString = String.valueOf(100);
        String doubleToString = String.valueOf(22.3);
        String charToString = String.valueOf('w');
        String boolToString = String.valueOf(false);

        System.out.printf("정수형을 문자열로 변환 : %s\n",intToString);
        System.out.printf("실수형을 문자열로 변환 : %s\n",doubleToString);
        System.out.printf("문자형을 문자열로 변환 : %s\n",charToString);
        System.out.printf("불린형을 문자열로 변환 : %s\n",boolToString);

        String strI = "Java Test";
        char [] strToCharArr = strI.toCharArray();
        System.out.printf("문자열을 문자 배열로 변환한 경우 : %s\n",Arrays.toString(strToCharArr));

        byte [] strToByteArr = strI.getBytes();
        System.out.printf("문자열을 바이트형 배열로 변환한 경우 : %s\n",Arrays.toString(strToByteArr));

    }
}
