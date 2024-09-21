package start;

public class AssignTest_01 {
    public static void main(String[] args) {
        int kk, tt, pp; // 정수형 변수 선언
        kk = 456785; // kk 에 값 할당
        tt = pp = kk ; // kk 에 저장된 값을 pp와 tt에 할당

        System.out.printf("kk = %d, tt = %d, pp = %d\n", kk, tt,pp);

        double d1 = 0.123, d2 = 23.56, d3;
        d3 = d1;
        System.out.printf("d1 = %.3f, d2 = %.3f, d3 = %.3f\n", d1, d2,d3);
    }
}
