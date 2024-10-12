package JavaUtil;
import java.util.Random;
import java.util.Scanner;

public class RandomClassTest_02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 난수를 생성하기 위해서 Random 클래스형인 객체 randNumber 생성
        Random randomNum = new Random();

        String answer;
        int inputNum = 0;
        do {
            int num = 1 + Math.abs(randomNum.nextInt()) % 100;
            System.out.printf("발생된 난수 = %d\n",num);

            while (inputNum != num) {
                System.out.print("1에서 100 사이의 정수 입력 : ");
                inputNum = sc.nextInt();
                if (inputNum > num) {
                    System.out.println("입력된 값은 난수보다 큰 수이다");
                } else if (inputNum < num) {
                    System.out.println("입력한 값은 난수보다 적은 수이다.");
                }
            }
            System.out.println("입력한 값이 난수와 일치");
            System.out.printf("난수 = %d, 입력된 정수 = %d\n",num,inputNum);
            System.out.printf("계속하시겠습니까? (Y/N) : ");
            answer = sc.next();
        }while(answer.equalsIgnoreCase("Y"));
        System.out.println("프로그램 종료");
    }
}
