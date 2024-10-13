package Generic;

public class GenericsTest_03 {
    // 네 개의 서로 다른 데이터 형에서 Generics를 이용하여 최소값 구하기
    public static void main(String[] args) {
        int a = 100, b = 200, c = 105, d = 300;
        System.out.printf("네 정수 %d, %d, %d, %d 중 최소값 = %d\n",a,b,c,d,minimum(a,b,c,d));

        double d1 = 3.2, d2 = 6.7, d3 = 4.5, d4 = -2.3;
        System.out.printf("네 실수 %3.2f, %3.2f, %3.2f, %3.2f 중 최소값 = %3.2f\n",d1,d2,d3,d4,minimum(d1,d2,d3,d4));

        String s1 = "수박", s2 = "참외", s3 = "복숭아", s4 = "포도";
        System.out.printf("네 문자열 %s, %s, %s, %s 중 최소값(코드값) = %s\n",s1,s2,s3,s4,minimum(s1,s2,s3,s4));
    }

    // 메소드로 전달된 정수형, 실수형, 문자열형에 따라서 최소값을 구하는 경우
    public static <T extends Comparable <T>> T minimum(T w, T x, T y, T z) {
        T min = w;
        if(x.compareTo(min) < 0 )
            min = x;
        if(y.compareTo(min) < 0 )
            min = y;
        if(z.compareTo(min) < 0 )
            min = z;

        return min;
    }
}
