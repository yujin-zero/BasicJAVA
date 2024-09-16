import java.util.Scanner;
public class FloatDoubleTypeTest_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float ft = sc.nextFloat(); // float 형 실수값 입력
        System.out.printf("float 값 : %.2f\n", ft);

        double dt = sc.nextDouble(); // double 형 실수값 입력
        System.out.printf("double 값 : %e\n", dt);
    }
}
