package JavaLang;
import java.util.Arrays;

public class StringClassTest_04 {
    public static void main(String[] args) {
        String strD = "Korea is very beautiful country.";
        int strLength = strD.length();
        System.out.printf("strD의 문자열의 길이 : %d\n",strLength);

        String strE = "    !!! Java Programming is fun!!!  ";
        System.out.printf("strE = %s\n",strE);

        String strF = strE.trim();
        System.out.printf("공백 제거 후 : %s\n",strF);

        String strG = strF.substring(8);
        System.out.printf("strF 문자열 8번째부터 끝까지 반환 : %s\n",strG);

        strG = strF.substring(8,11);
        System.out.printf("strF 문자열 8번째부터 10번째 : %s\n",strG);

        String strH = "Kim:Park:Lee:Hong:Choi";
        String [] strArr = strH.split(":");
        System.out.printf("문자열 strH를 :을 기준으로 분리한 경우 : %s\n",Arrays.toString(strArr));
    }
}
