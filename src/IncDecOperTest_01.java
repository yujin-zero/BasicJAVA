public class IncDecOperTest_01 {
    public static void main(String[] args) {
        int x = 100;
        System.out.printf("x의 현재 값 = %d\n", (++x)); // 전위 증가 연산자인 경우

        x = 200; // x를 200으로 초기화
        System.out.printf("x의 현재 값 = %d\n", (x++)); // 후위 증가 연산자인 경우
    }
}
