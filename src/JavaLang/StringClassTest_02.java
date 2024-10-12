package JavaLang;

public class StringClassTest_02 {
    public static void main(String[] args) {
        String strA = "String Class Methods Test";
        String strC = "string class methods test";
        boolean strCompare;

        strCompare = strA.equals(strC);
        System.out.printf("두 문자열 비교(대소문자 구분하는 경우) : %b\n",strCompare);

        strCompare = strA.equalsIgnoreCase(strC);
        System.out.printf("두 문자열 비교(대소문자 구분 안한 경우) : %b",strCompare);
    }
}
