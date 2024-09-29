package OOP;

public class StringClassTest_01 {
    public static void main(String[] args) {
        String strA = new String("소유진");
        System.out.printf("new 연산자 사용한 경우 strA : %s\n",strA);

        String strB = "김유진";
        System.out.printf("new 연산자 사용하지 않은 경우 strB : %s\n",strB);

        // 문자열 복사
        strA = strB;
        System.out.printf("strA = %s\n",strA);
        System.out.printf("strB = %s",strB);
    }
}
