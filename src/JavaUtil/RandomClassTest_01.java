package JavaUtil;
import java.util.Random;

public class RandomClassTest_01 {
    public static void main(String[] args) {
        // 난수를 생성하기 위해서 Random 클래스형인 객체 randNumber 생성
        Random randNumber = new Random();
        int num;
        for (int i = 0; i < 10; i++) {
            // 1에서 20 사이의 난수 발생
            num = 1 + Math.abs(randNumber.nextInt()) % 20;
            System.out.printf("%d  ",num);
        }
    }
}