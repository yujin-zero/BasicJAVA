package ControlStatements;

public class WhileTest_01 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.printf("1에서 10 까지의 정수의 합 = %d", sum);
    }
}
