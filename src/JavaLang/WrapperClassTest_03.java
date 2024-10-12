package JavaLang;

public class WrapperClassTest_03 {
    public static void main(String[] args) {
        // Character 클래스
        char c1 = '1';
        char c2 = 'a';
        char c3 = 'B';
        char c4 = ' ';

        boolean b1 = Character.isDigit(c1);
        boolean b2 = Character.isLetter(c2);
        System.out.printf("char 1 가 숫자이면 ? : %b\n",b1);
        System.out.printf("char a 가 문자이면 ? : %b\n",b2);

    }
}
