package JavaLang;

public class WrapperClassTest_01 {
    public static void main(String[] args) {
        // 문자열을 정수로 변환
        String s1 = "1234", s2 = "3456";
        int x = Integer.parseInt(s1);
        int y = Integer.parseInt(s2);
        int sum = x + y;
        System.out.printf("%d + %d = %d\n\n",x,y,sum);

        // 문자열을 실수로 변환
        String s3 = "12.34", s4 = "34.56";
        double d1 = Double.parseDouble(s3);
        double d2 = Double.parseDouble(s4);
        double dSum = d1 + d2;
        System.out.printf("%.3f + %.3f = %.3f\n\n",d1,d2,dSum);

        // 두 문자의 ASCII Code 값을 비교하여 같으면 1을, 다르면 0을 return
        char c1 = 'A', c2 = 'A';
        int ascCodeCompare = Character.compare(c1,c2);
        System.out.printf("ASCII Code 비교 결과 = %d\n",ascCodeCompare); // 같으면 0을 반환
    }
}
