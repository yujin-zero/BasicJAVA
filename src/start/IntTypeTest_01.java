package start;

import java.util.Scanner;
public class IntTypeTest_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("byte 형 정수값 입력: ");
        byte bt = sc.nextByte();
        System.out.printf("byte 값 : %d\n", bt);

        System.out.print("short 형 정수값 입력: ");
        short st = sc.nextShort();
        System.out.printf("short 값 : %d\n", st);

        System.out.print("int 형 정수값 입력: ");
        int it = sc.nextInt();
        System.out.printf("int 값 : %d\n", it);

        System.out.print("long 형 정수값 입력: ");
        long lot = sc.nextLong();
        System.out.printf("long 값 : %d\n", lot);

    }
}

