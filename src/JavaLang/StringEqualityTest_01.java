package JavaLang;

public class StringEqualityTest_01 {
    public static void main(String[] args) {
        String strA = "WelCome!";
        String strB = "WelCome!";
        String strC = new String(strA);

        boolean identityTest, equalityTest;
        System.out.printf("첫번째 문자열 : %s\n",strA);
        System.out.printf("두번째 문자열 : %s\n",strB);
        System.out.println();

        identityTest = (strA == strB); // 주소 비교
        System.out.printf("두 문자열의 identity == 사용한 경우 : %b\n",identityTest);

        equalityTest = strA.equals(strB); // 값 비교
        System.out.printf("두 문자열의 equality equals() 사용한 경우 : %b\n",equalityTest);

        identityTest = (strA == strC); // 새로운 객체 생성 후의 객체 참조 변수
        System.out.printf("두 문자열의 identity == 사용한 경우 : %b\n",identityTest);

        equalityTest = strA.equals(strC); // 값 비교
        System.out.printf("두 문자열의 equality equals() 사용한 경우 : %b\n",equalityTest);

    }
}
