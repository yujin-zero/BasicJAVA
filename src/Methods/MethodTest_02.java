package Methods;

public class MethodTest_02 {
    public static void main(String[] args) {
        int a = 100, b = 500;

        // 메소드 호출 후 값만 넘겨 받는 경우
        int sum = add(a,b);
        System.out.printf("메소드 호출 후 리던 되는 값 = %d",sum);
    }

    private static int add(int a, int b) {
        int total = a + b;
        System.out.printf("메소드 내에서 두 수의 합 = %d\n", total);
        return total;
    }
}
