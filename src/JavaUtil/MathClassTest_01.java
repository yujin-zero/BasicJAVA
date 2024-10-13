package JavaUtil;

public class MathClassTest_01 {
    public static void main(String[] args) {
        // Math 클래스
        System.out.printf("PI 값 : %.5f\n",Math.PI);
        System.out.printf("E의 값 : %.5f\n",Math.E);
        int x = 2;
        System.out.printf("2에 대한 지수 값 : %.5f\n",Math.exp(x));
        System.out.printf("2에 대한 자연로그 값 : %.5f\n",Math.log(x));
        System.out.printf("2에 대한 상용로그 값 : %.5f\n",Math.log10(x));

        int degree = 30;
        double radianValue = Math.toRadians(degree);

        System.out.printf("30도에 대한 라디안 값 : %.5f\n",radianValue);
        System.out.printf("sin(30) : %3.2f\n",Math.sin(radianValue));
        System.out.printf("cos(30) : %3.2f\n",Math.cos(radianValue));
        System.out.printf("tan(30) : %3.2f\n",Math.tan(radianValue));

        double convertedDegree = Math.toDegrees(radianValue);
        System.out.printf("라디안 값을 30도로 변환 : %3.2f",convertedDegree);
    }
}
