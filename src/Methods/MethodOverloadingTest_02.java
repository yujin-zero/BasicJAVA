package Methods;

public class MethodOverloadingTest_02 {
    public static void main(String[] args) {
        // 메소드 오버로딩 : 인수의 형이 다른 경우
        int intSum = adding(10,30);
        float floatSum = adding(10.5f, 20.4f);
        double doubleSum = adding(50.43, 56.23);
        String stringConcat = adding("참 재미있는 Java!","기필코 정복하자!");

        System.out.printf("int 합 : %d\n",intSum);
        System.out.printf("float 합 : %.3f\n",floatSum);
        System.out.printf("double 합 : %.3f\n",doubleSum);
        System.out.printf("문자열 합 : %s\n",stringConcat);
    }

    private static String adding(String a, String b) {
        return a + b;
    }

    private static double adding(double a, double b) {
        return a + b;
    }

    private static float adding(float a, float b) {
        return a + b;
    }

    private static int adding(int i, int j){
        return i + j;
    }
}
