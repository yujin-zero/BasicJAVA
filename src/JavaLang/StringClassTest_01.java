package JavaLang;

public class StringClassTest_01 {
    public static void main(String[] args) {
        String strA = "String Class Methods Test";
        String strB;
        System.out.printf("strA : %s\n",strA);

        char ch = strA.charAt(10);
        System.out.printf("문자열에서 10번째 문자는 : %c \n",ch);

        strB = strA.replace('t','k');
        System.out.printf("문자열에서 t를 k로 변경한 경우 : %s\n",strB);

        strB = strA.toLowerCase();
        System.out.printf("strA에서 대문자를 소문자로 변환 : %s\n",strB);

        strB = strA.toUpperCase();
        System.out.printf("strA에서 소문자를 대문자로 변환 :%s",strB);
    }
}
