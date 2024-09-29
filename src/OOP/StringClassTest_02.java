package OOP;

public class StringClassTest_02 {
    public static void main(String[] args) {
        String strA = new String("ABBA");
        String strB = "ABBA";

        // 문자열에서 == 연산자는 주소를 비교
        boolean resultA = (strA == strB);
        System.out.printf("== 연산자는 주소 비교 : %b\n",resultA);

        if (strA == strB)
            System.out.printf("%s와 %s는 동일한 문자열 취급\n",strA,strB);
        else
            System.out.printf("%s와 %s는 동일한 문자열로 취급안함\n",strA,strB);

        System.out.println("--------------");

        // 문자열에서 내용 비교 시 문자열에서 equals() 메소드 사용
        boolean resultB = strA.equals(strB);
        System.out.printf("equals() 메소드는 내용 비교 : %b\n",resultB);

        if (strA.equals(strB))
            System.out.printf("%s와 %s는 동일한 문자열 취급\n",strA,strB);
        else
            System.out.printf("%s와 %s는 동일한 문자열로 취급안함",strA,strB);

    }
}
