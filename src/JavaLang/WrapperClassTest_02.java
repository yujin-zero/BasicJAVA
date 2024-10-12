package JavaLang;

public class WrapperClassTest_02 {
    public static void main(String[] args) {
        // Integer 클래스
        int i = 15;
        String s1 = Integer.toBinaryString(i);
        System.out.printf("10진수 %d = 2진수 %s\n",i,s1);

        String s2 = Integer.toOctalString(i);
        System.out.printf("10진수 %d = 8진수 %s\n",i,s2);

        String s3 = Integer.toHexString(i);
        System.out.printf("10진수 %d = 16진수 %s\n",i,s3);
    }
}
