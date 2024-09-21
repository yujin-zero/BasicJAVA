package ControlStatements;

public class DoWhileTest_01 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        do {
            sum += i;
            i++;
        } while (i <= 10);
        System.out.printf("1에서 10 까지의 정수의 합 = %d", sum);
    }
}
