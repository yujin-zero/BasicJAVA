package ControlStatements;
import java.util.Scanner;

public class IfTest_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수 입력 : ");
        int score = sc.nextInt();

        if (score <= 90) {
            System.out.println("성적이 좋지않군요!");
            System.out.println("앞으로 좀 더 노력이 필요합니다.");
        }
        System.out.printf("당신의 성적은 %d 점입니다.", score);
    }
}
