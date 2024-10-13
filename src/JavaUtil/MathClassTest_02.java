package JavaUtil;

public class MathClassTest_02 {
    public static void main(String[] args) {
        System.out.printf("2의 4제곱 : %.2f\n",Math.pow(2,4));
        System.out.printf("64의 제곱근 : %.2f\n",Math.sqrt(64));
        System.out.printf("64의 세제곱근 : %.2f\n",Math.cbrt(64));

        System.out.printf("-16에 대한 절대 값 = %d\n",Math.abs(-16));
        System.out.printf("160과 700 중 큰 수 : %d\n",Math.max(160,700));
        System.out.printf("160과 700 중 작은 수 : %d\n",Math.min(160,700));
    }
}
